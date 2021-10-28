package com.lzj.demo;

import java.io.OutputStream;

public class MyResponse {

    private OutputStream outputStream;

    public MyResponse(OutputStream os){
        this.outputStream = os;
    }

    public void write(String s)throws Exception{
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HTTP/1.1 200 OK\n");
        stringBuilder.append("Content-Type:text/html\n");
        stringBuilder.append("\r\n");
        stringBuilder.append("<html>");
        stringBuilder.append("<body>");
        stringBuilder.append("<h1>"+s+"</h1>");
        stringBuilder.append("</body>");
        stringBuilder.append("</html>");
        outputStream.write(stringBuilder.toString().getBytes());
        outputStream.flush();
    }
}
