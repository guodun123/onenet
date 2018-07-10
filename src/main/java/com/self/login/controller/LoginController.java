package com.self.login.controller;

import com.self.login.model.Login;
import com.self.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LoginController {
    @Autowired
    private LoginService loginService;

    public String jumpIndex(){
        return "";
    }

    public void login(Login login){

    }
    public static void main(String[] args) {

    }
}
