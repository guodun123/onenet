package login.controller;

import login.model.Login;
import login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
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
}
