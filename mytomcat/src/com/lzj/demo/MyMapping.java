package com.lzj.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求映射器
 */
public class MyMapping {

    public static Map<String,String> mapping = new HashMap<>();

    static{
        mapping.put("/mytomcat","com.lzj.demo.MyServlet");
    }
}
