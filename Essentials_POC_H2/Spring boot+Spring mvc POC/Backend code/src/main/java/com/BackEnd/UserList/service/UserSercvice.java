package com.BackEnd.UserList.service;


import com.BackEnd.UserList.model.User;
import com.BackEnd.UserList.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserSercvice {

    @Autowired
    private UserRepository userRepository;

   public List<User> getUsers(){
       return userRepository.findAll();
   }

   public User addUser(User user){
       return userRepository.saveAndFlush(user);
   }

   public User updateUser(Long id, User user){
       User u = userRepository.findById(id).get();
       if (user.getFname() != null)
           u.setFname(user.getFname());
       if (user.getLname() != null)
           u.setLname(user.getLname());
       if (user.getGender() != null)
           u.setGender(user.getGender());
       if (user.getCity() != null)
           u.setCity(user.getCity());

       userRepository.saveAndFlush(u);
       return u;
   }

   public User deleteUser(Long id){
       User u  = userRepository.findById(id).get();
       userRepository.deleteById(id);
       return u;
   }

    public User getByID(Long id) {
       return userRepository.findById(id).get();
    }
}
