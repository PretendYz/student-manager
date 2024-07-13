package com.hengtiansoft.studentmanager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hengtiansoft.studentmanager.domain.User;

public interface UserService extends IService<User> {
    User findByUsername(String username);
    void register(User user) ;
}
