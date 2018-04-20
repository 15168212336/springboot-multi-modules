package com.zg.controller;

import com.zg.UserService;
import com.zg.entity.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    public TUser doGetUser(@RequestParam Integer id) {
        return userService.doGetUserById(id);
    }

}
