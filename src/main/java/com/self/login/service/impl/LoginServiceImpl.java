package com.self.login.service.impl;

import com.self.login.dao.LoginDao;
import com.self.login.model.Login;
import com.self.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao dao;

    public String login(Login login) {
        return null;
    }
}
