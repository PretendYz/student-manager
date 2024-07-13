package com.hengtiansoft.studentmanager.controller;

import com.hengtiansoft.studentmanager.R.R;
import com.hengtiansoft.studentmanager.domain.User;
import com.hengtiansoft.studentmanager.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/13 21:28
 * @Description:
 */

@RestController
@RequestMapping("User")
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(summary = "用户注册")
    @PostMapping("/register")
    public R register(@RequestBody User user) {
        if (!Objects.isNull(userService.findByUsername(user.getUsername()))) {
            return R.error().message("该用户名已存在");
        }
        userService.register(user);
        return R.ok();
    }

    @Operation(summary = "用户登录")
    @GetMapping("/login")
    public R login(@RequestParam("username") String username, @RequestParam("password") String password) {
        if(userService.login(username, password)) {
            return R.ok();
        }
        return R.error().message("用户登录失败");
    }
}
