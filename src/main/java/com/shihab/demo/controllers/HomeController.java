package com.shihab.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {


    @RequestMapping(value = "/home" , method = RequestMethod.GET)
    public String home(){

        return "Hello";
    }


    @RequestMapping(value = "/contactus" , method = RequestMethod.GET)
    public String contactUs(){

        return "index";
    }
}
