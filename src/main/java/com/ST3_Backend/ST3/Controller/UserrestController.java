package com.ST3_Backend.ST3.Controller;


import com.ST3_Backend.ST3.Model.User;
import com.ST3_Backend.ST3.Service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserrestController {
    @Autowired
    private UserService userService;

    @Autowired
   private UserController userController;


    @RequestMapping(value = "/checkuser",method = RequestMethod.POST)
    public String usercheck(@RequestBody String data) throws JsonProcessingException {
        System.out.println(data);
     User user = new ObjectMapper().readValue(data, User.class);
        System.out.println(user.toString());
        if(userService.checkuser(user)) {
            System.out.println("Userfound");
//            userController.dasboard();
            return "";
        }
        else
        {

            return "false";
        }


    }
}
