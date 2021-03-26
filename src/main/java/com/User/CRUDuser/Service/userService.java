package com.User.CRUDuser.Service;

import com.User.CRUDuser.Entity.User;
import com.User.CRUDuser.UserRepository.userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class userService {
   @Autowired
    private userrepository userrepository;

   //Create user
    public User createUser(User user){
        return  userrepository.save(user);
    }

    // Get users

    public List<User> getusers(){
        return userrepository.findAll();
    }

    // Get user By Id
    public  User getUserById( int id){
        return  userrepository.findById(id).get();
    }
    // Update user
    public  User updateuser(int id ,User user){
        Optional<User> OldUser= userrepository.findById(id);
        if(OldUser.isPresent()){
            OldUser.get().setFirst_name(user.getFirst_name());
            OldUser.get().setLast_name(user.getLast_name());
            OldUser.get().setEmail(user.getEmail());
            OldUser.get().setSalary(user.getSalary());
            userrepository.save(OldUser.get());
        }

        return null;
    }

    // Delete User

    public boolean deleteuser( int id){
        userrepository.deleteById(id);
        return true;
    }


}
