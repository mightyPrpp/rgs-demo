

package com.example.demoproject.Services;


import com.example.demoproject.Domain.User;
import com.example.demoproject.Exceptions.InvalidCredentialsException;   //Invalid credentials expetio
import com.example.demoproject.Repositories.UserRepository;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;


@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(LoginServiceImpl.class);
    private Set<String> loggedInUsers = new HashSet<>();


    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String username, String password) throws AuthenticationException {

        User retrievedUser = userRepository.findByUsernameAndPassword(username, password);
        if (retrievedUser == null) {
            throw new InvalidCredentialsException("User not found!");
        }

        loggedInUsers.add(username);
        return retrievedUser;
    }

    @Override
    public void logout(String username) {
        loggedInUsers.remove(username);
    }
/*
    @Override
    public void register(User user) throws Exception {
        userRepository.save(user);
        LOG.debug("User has been registered!");
    } */

}
