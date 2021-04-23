package com.ST3_Backend.ST3.Service;


import com.ST3_Backend.ST3.Model.User;
import com.ST3_Backend.ST3.Model.UserDetails;
import com.ST3_Backend.ST3.Repo.UserDetailRepo;
import com.ST3_Backend.ST3.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
        @Autowired
        private UserRepo userRepo;

        @Autowired
        private UserDetailRepo userDetailRepo;

      public boolean checkuser(User user)
      {
          String id=user.getUsername();
          Optional<User> user_2 = this.userRepo.findById(id);
          System.out.println(user.toString());
          if(user_2.isPresent()){
              User j=user_2.get();
              System.out.println(j.toString());
              if(user.getPassword().equals(j.getPassword()))
              return true;
              else {
                  return false;
              }
          }else{
              System.out.println("nah");
              return false;
          }
      }
      public boolean userdetailsadd(UserDetails userDetails)
      {
       User user=new User();

       user.setUsername(userDetails.getUsername());
       user.setPassword(userDetails.getPassword());
          if(this.userRepo.existsById(user.getUsername())){
              return false;
          }else{
              try {
                  this.userDetailRepo.save(userDetails);
                  this.userRepo.save(user);

              }
              catch (Exception e)
              {
                  return false;
              }
              return true;
          }

      }

}
