package com.dong.musicapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IDEA
 * author:DongRonglong
 * Date:2018/7/16
 * Time:11:21
 */

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
