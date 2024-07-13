package com.hengtiansoft.studentmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hengtiansoft.studentmanager.domain.User;
import com.hengtiansoft.studentmanager.mapper.UserMapper;
import com.hengtiansoft.studentmanager.service.UserService;
import com.hengtiansoft.studentmanager.utils.BCryptUtil;
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
        user.setPassword(BCryptUtil.encrypt(user.getPassword()));
        save(user);
    }

    @Override
    public boolean login(String username, String password) {
        User user = findByUsername(username);
        return BCryptUtil.verify(password, user.getPassword());
    }
}
