package com.example.demo.controllers;

import com.example.demo.Cache;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    Cache user = new Cache();
    @GetMapping("/get_user_data")
    @ResponseBody
    public String userCache(@RequestParam int id) throws InterruptedException{
        if (user.has(id)){
            return user.get(id);
        } else {
            User user2 = new User(id);
            String Dataslow = user2.getDataSlow();
            user.set(id, Dataslow);
            return Dataslow;
        }
    }


}


