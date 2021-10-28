package com.lzj.demo;

public class MyServlet extends MyHttpServlet{
    @Override
    public void doGet(MyRequest request, MyResponse response) throws Exception{
        response.write("My Tomcat");
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) throws Exception{
        response.write("My Tomcat");
    }
}
