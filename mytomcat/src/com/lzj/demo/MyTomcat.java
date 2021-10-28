package com.lzj.demo;

import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(10086);

        while(true){
            Socket socket = serverSocket.accept();

            //获取请求对象
            MyRequest request = new MyRequest(socket.getInputStream());
            //获取响应对象
            MyResponse response = new MyResponse(socket.getOutputStream());

            if(request.getRequestUrl()!=null){
                //获取请求url对应的类名
                String className = MyMapping.mapping.get(request.getRequestUrl());
                //通过反射创建自定义Servlet对象
                try{
                    Class<?> clazz = Class.forName(className);
                    MyHttpServlet myServlet = (MyHttpServlet) clazz.newInstance();
                    myServlet.service(request,response);
                }catch(ClassNotFoundException | NullPointerException e){
                    System.out.println("无法获取未定义类");
                }
            }
        }
    }
}
