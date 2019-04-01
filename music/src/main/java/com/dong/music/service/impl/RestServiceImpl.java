package com.dong.music.service.impl;

import com.dong.music.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:DongRonglong
 * Date:2018/8/8
 * Time:9:56
 */
@Service
public class RestServiceImpl implements RestService {
    private static final String url="http://localhost:8080/";
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Map getRestData(String name) {
        System.out.println(name);
        return restTemplate.getForObject(url+name,HashMap.class);
    }
}
