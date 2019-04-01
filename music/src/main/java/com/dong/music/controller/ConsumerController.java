package com.dong.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:DongRonglong
 * Date:2018/8/8
 * Time:10:03
 */
//@CrossOrigin(allowCredentials="true", allowedHeaders="*", methods={RequestMethod.POST}, origins="*")
@RestController
@RequestMapping("/mic")
public class ConsumerController {
    public static final String MUSIC_LIST_URL = "http://music-api/mic/search";  //这里不能使用下划线
    public static final String MUSIC_PLAY_URL="http://music-api/mic/";
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HttpHeaders headers;

    @RequestMapping("/list")
    public Map search(@RequestParam Map<String, Object> map1){
        System.out.println(headers.get("Authorization"));
        String url=MUSIC_LIST_URL+"?source="+map1.get("source")+"&words="+map1.get("words")+"&pages="+map1.get("pages")+"&count="+map1.get("count");
        System.out.println(url);
        Map map=restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<Object>(headers),HashMap.class).getBody();
//        Map map=restTemplate.getForObject(MUSIC_LIST_URL+"?source="+map1.get("source")+"&words="+map1.get("words")+"&pages="+map1.get("pages")+"&count="+map1.get("count"),HashMap.class);
        return map;
//        return restService.getRestData("/mic/search?source="+map1.get("source")+"&words="+map1.get("words")+"&pages="+map1.get("pages")+"&count="+map1.get("count"));
    }

    @RequestMapping("/play")
    public Map play(@RequestParam Map<String,Object> map){
        Map result=new HashMap();
        if (map.get("source").equals("kugou")){
            String url=MUSIC_PLAY_URL+"kgplay"+"?hash="+map.get("hash");
            result=restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<Object>(headers),HashMap.class).getBody();
            return result;
        }else if (map.get("source").equals("tencent")){
            String url=MUSIC_PLAY_URL+"Qplay"+"?mid="+map.get("mid")+"&musicName="+map.get("musicName");
            result=restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<>(headers),HashMap.class).getBody();
            return result;
        }else if (map.get("source").equals("cloud")){

        }
        return null;
    }
    @RequestMapping("/ablum")
    public Map paly(){
        return null;
    }
    @RequestMapping("/get/lrc")
    public Map getLrc(@RequestParam String mid){
        String url=MUSIC_PLAY_URL+"lrc?mid="+mid;
        Map map=restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<Object>(headers),Map.class).getBody();
        return map;
    }
}
