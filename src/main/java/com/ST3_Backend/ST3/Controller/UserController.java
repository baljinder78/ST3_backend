package com.ST3_Backend.ST3.Controller;



import com.ST3_Backend.ST3.Model.User;
import com.ST3_Backend.ST3.Service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/")
    public String home(){

        return "index";
    }

    @RequestMapping("/Login")
    public String login(){

        return "/html/Login";
    }

    @RequestMapping("/signup")
    public String signup(){

        return "/html/signup";
    }

    @RequestMapping(value = "/dashboard")
    public String dasboard(){
        System.out.println("ru v");
        return "/html/Dashboard";
    }

}
