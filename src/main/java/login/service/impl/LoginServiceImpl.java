package login.service.impl;

import login.dao.LoginDao;
import login.model.Login;
import login.service.LoginService;
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
