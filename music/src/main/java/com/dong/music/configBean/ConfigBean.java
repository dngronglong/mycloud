package com.dong.music.configBean;

//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * Created with IDEA
 * author:DongRonglong
 * Date:2018/8/8
 * Time:9:50
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced//实现客户端负载均衡Ribbon
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Bean
    public HttpHeaders getHeader(){
        HttpHeaders headers=new HttpHeaders();
        String auth="admin:admin";//认证的原始信息
        byte[] encodeAuth=Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));//将原始认证信息进行Base64加密
        String authHeader="Basic "+new String(encodeAuth);//加密后的认证信息要与Basic有个空格
        headers.set("Authorization", authHeader);
        return headers;
    }
}
