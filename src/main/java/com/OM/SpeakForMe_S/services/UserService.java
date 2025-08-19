package com.OM.SpeakForMe_S.services;

import com.OM.SpeakForMe_S.entity.Users;
import com.OM.SpeakForMe_S.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // CREATE
    public Users userCreate(Users user){
        if(userRepository.existsByEmail(user.getEmail())){
            throw new IllegalArgumentException("O email já está em uso.");
        }
        return userRepository.save(user);
    }

    // READ - todos os usuários
    public List<Users> getUsers(){
        return userRepository.findAll();
    }

    // READ - usuário por ID
    public Users getUserById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));
    }

    // UPDATE
    public Users updateUser(Long id, Users userDetails){
        Users user = getUserById(id);

        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        user.setPhoto(userDetails.getPhoto());
        user.setBiograph(userDetails.getBiograph());
        user.setRole(userDetails.getRole());

        return userRepository.save(user);
    }

    // DELETE
    public void deleteUser(Long id){
        Users user = getUserById(id);
        userRepository.delete(user);
    }

}
