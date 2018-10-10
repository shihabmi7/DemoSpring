package com.shihab.demo.controllers;

import com.shihab.demo.entities.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
//@ResponseBody
//@RestController
public class HomeController {


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {

        return "Hello";
    }


    @GetMapping("/")
    public ModelAndView home(@RequestParam("name") String name) {

//        HashMap<String, Object> model = new HashMap<String, Object>();
//        model.put("name", name);
        //return "Hello: " + name + " how are you?";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", name);
        modelAndView.setViewName("index");

        return modelAndView;
    }



    @GetMapping("/mydata")
    public ModelAndView myData(Model aModel) {

//        HashMap<String, Object> model = new HashMap<String, Object>();
//        model.put("name", name);
        //return "Hello: " + name + " how are you?";

        ModelAndView modelAndView = new ModelAndView();
        //modelAndView.addObject("name", name);
        modelAndView.setViewName("index");
        modelAndView.addObject(aModel);

        return modelAndView;
    }


    @GetMapping("/test")
    public ModelAndView Test(Person person) {

//        HashMap<String, Object> model = new HashMap<String, Object>();
//        model.put("name", name);
        //return "Hello: " + name + " how are you?";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(person);
        modelAndView.setViewName("index");

        return modelAndView;
    }


}
