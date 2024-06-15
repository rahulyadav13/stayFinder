package com.StayFinder.StayFinder.service;


import com.StayFinder.StayFinder.dto.PropertiesUserDto;
import com.StayFinder.StayFinder.entity.PropertiesUser;
import com.StayFinder.StayFinder.repository.PropertiesUserRepository;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private PropertiesUserRepository userRepository;

    public UserService(PropertiesUserRepository userRepository) {
        this.userRepository = userRepository;
    }
//    public PropertiesUserDto addUser(PropertiesUserDto propertiesUserDto){
//        PropertiesUser user = new PropertiesUser();
//        user.setFirstName(propertiesUserDto.getFirstName());
//        user.setLastName(propertiesUserDto.getLastName());
//        user.setUsername(propertiesUserDto.getUsername());
//        user.setEmail(propertiesUserDto.getEmail());
//
//        //BCryptPasswordEncoder is a class provided by Spring Security. It's used to hash passwords using the BCrypt hashing algorithm, which is a secure way to store passwords.
//        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
//        user.setUserRole(propertiesUserDto.getUserRole());
//        PropertiesUser savedUser = userRepository.save(user);
//    }
//
}
