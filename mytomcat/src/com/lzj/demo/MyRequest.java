package com.lzj.demo;

import java.io.InputStream;

public class MyRequest {
    //请求地址
    private String requestUrl;
    //请求方法
    private String requestMethod;

    public MyRequest(InputStream is) throws Exception{
        byte[] bytes = new byte[1024];
        int len = 0;
        String s = null;
        if((len = is.read(bytes))>0){
            s = new String(bytes,0,len);
            String data = s.split("\n")[0];
            String[] params = data.split(" ");
            this.requestMethod = params[0];
            this.requestUrl = params[1];
        }
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }
}
