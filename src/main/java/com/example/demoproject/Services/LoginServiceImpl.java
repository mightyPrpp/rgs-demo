package com.example.demoproject.Services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;
//import com.example.demoproject.DAO.
import com.example.demoproject.Domain.User;
import com.example.demoproject.Exceptions.LogoutException;

import org.springframework.transaction.annotation.Transactional;

public class LoginServiceImpl {


    @Service
    @Transactional
    public class AccountServiceImpl implements LoginService {
        private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(AccountServiceImpl.class);

        @Autowired
        private AccountDao accountDao;

        @Override
        public void login(String username, String password) throws AuthenticationException {

            try {
                accountDao.login(username, password);
            } catch (Exception e) {
                throw new InvalidCredentialsException("User not found!");
            }
        }

        @Override
        public void logout(String username) {
            try {
                accountDao.logout(username);
            } catch (Exception e) {
                throw new LogoutException("User not logged in!");
            }
        }
/*
        @Override
        public void register(User user) throws Exception {
            accountDao.register(user);
            LOG.debug("User has been registered!");
        }  */

    }



}
