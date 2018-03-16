package com.self.login.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
@Setter
public class Login {

    private String userName;

    private String password;

    private Integer status;

    private Date createdTime;

    private Date updatedTime;

    private String remark;

    private Integer isDeleted;
}
