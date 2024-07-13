package com.hengtiansoft.studentmanager.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("user")
public class User implements Serializable {

    private Long id;

    private String username;

    private String password;

    private String nickname;

    private Integer role;

    private Integer delFlag;
}
