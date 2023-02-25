package org.tango.controller;

import org.tango.po.CommonResult;
import org.tango.po.User;
import org.tango.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/UserController")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUserByIdByPass/{userId}/{password}")
    public CommonResult<User> getUserByIdByPass(@PathVariable String userId, @PathVariable String password) {
        return new CommonResult<>(200, "success", userService.getUserByIdByPass(userId, password));

    }

    @GetMapping("/getUserById/{userId}")
    public CommonResult<Integer> getUserById(@PathVariable("userId") String userId) {
        return new CommonResult<>(200, "success", userService.getUserById(userId));
    }

    @PostMapping("/saveUser/{userId}/{password}/{userName}/{userSex}")
    public CommonResult<Integer> saveUser(
            @PathVariable("userId") String userId,
            @PathVariable("password") String password,
            @PathVariable("userName") String userName,
            @PathVariable("userSex") Integer userSex) {
        return new CommonResult<>(200, "success", userService.saveUser(userId, password, userName, userSex));
    }
}
