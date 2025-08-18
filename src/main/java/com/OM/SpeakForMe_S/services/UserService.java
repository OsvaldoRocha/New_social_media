package com.OM.SpeakForMe_S.services;

import com.OM.SpeakForMe_S.entity.Users;
import com.OM.SpeakForMe_S.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public Users userCreat(Users user){
        if(userRepository.existsByEmail(user.getEmail())){
            throw new IllegalArgumentException("O email já está em uso.");
        }

        return userRepository.save(user);
    }

    public List<Users> getUsers(){
        return userRepository.findAll();
    }

}
