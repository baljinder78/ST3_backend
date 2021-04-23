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

    @RequestMapping("/dashboard")
    public String usercheck(@RequestBody String data) throws JsonProcessingException {
        System.out.println(data);
        User user = new ObjectMapper().readValue(data, User.class);
        System.out.println(user.toString());
        if(userService.checkuser(user)) {
            System.out.println("Userfound");
            return "/html/Dashboard";
        }
        else
        {
            return "/html/Login";
        }


    }
//    public String dasboard(){
//        System.out.println("ru v");
//        return "redirect:/html/Dashboard";
//    }

}
