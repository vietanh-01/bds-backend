package com.example.bds_backend.utils;

import com.example.bds_backend.dto.response.CustomUserDetails;
import com.example.bds_backend.entity.User;
import com.example.bds_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserUtils implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        if(user.get() == null) {
            throw new UsernameNotFoundException(username);
        }

        return new CustomUserDetails(user.get());
    }


}
