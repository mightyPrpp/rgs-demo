package com.example.demoproject.Services;

import org.springframework.security.core.AuthenticationException;
import com.example.demoproject.Domain.User;
public interface LoginService {


    User login(String username, String password) throws AuthenticationException;

    void logout(String username) throws Exception;

    //void register(User user) throws Exception;
}





