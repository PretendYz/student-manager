package com.hengtiansoft.studentmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hengtiansoft.studentmanager.domain.User;
import com.hengtiansoft.studentmanager.mapper.UserMapper;
import com.hengtiansoft.studentmanager.service.UserService;
import com.hengtiansoft.studentmanager.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/13 21:31
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User findByUsername(String username) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<User>();
        queryWrapper.eq(User::getUsername, username);
        return getOne(queryWrapper);
    }

    @Override
    public void register(User user) {
        user.setPassword(Md5Util.md5(user.getPassword()));
        save(user);
    }
}
