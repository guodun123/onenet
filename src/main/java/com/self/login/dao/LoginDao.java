package com.self.login.dao;

import com.self.login.model.Login;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
    void insert(Login login);
}
