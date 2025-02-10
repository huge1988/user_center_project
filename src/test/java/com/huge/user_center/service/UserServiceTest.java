package com.huge.user_center.service;

import com.huge.user_center.model.domain.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;


    @Test
    public void testCreateUser(){
        User user = new User();
        user.setUsername("ces");
        user.setUserAccount("18777");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("18702636348");
        user.setEmail("18702636348@139.com");
        user.setUserStatus(0);
        user.setIsDelete(0);
        user.setUserRole(1);
        userService.save(user);
    }
}