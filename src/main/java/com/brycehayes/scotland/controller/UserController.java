package com.brycehayes.scotland.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.brycehayes.scotland.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
    @RequestMapping(value = "/read/one", method=RequestMethod.GET) //this is replaced with @GetMapping()
    public String readUser(){
        User user = new User("Bryce","Hayes","bryce.hayes@javadev.com");
        return user.toString();
    }
}