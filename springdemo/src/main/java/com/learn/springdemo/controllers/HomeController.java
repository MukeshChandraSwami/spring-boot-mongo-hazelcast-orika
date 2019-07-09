package com.learn.springdemo.controllers;

import com.learn.springdemo.service.ActiveProfileService;
import com.learn.springdemo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @Autowired
    private ActiveProfileService activeProfileService;

    @RequestMapping("/home")
    @ResponseBody  public String helloSpring(){

        return homeService.getHomeDetails().toString();
    }

    @RequestMapping("/env")
    @ResponseBody public String checkActivePrfile(){

        return activeProfileService.getActiveProfile() + " : " + activeProfileService.getMsg();
    }
}
