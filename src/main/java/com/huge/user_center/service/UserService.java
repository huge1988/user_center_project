package com.huge.user_center.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huge.user_center.model.domain.User;

/**
 * @author Administrator
 * @description 针对表【user】的数据库操作Service
 * @createDate 2025-02-10 22:09:45
 */
public interface UserService extends IService<User> {


    /**
     *  用户注册
     * @param account 账号
     * @param userPassword 密码
     * @param checkPassword 校验码
     * @return
     */
    User userRegister(String account, String userPassword, String checkPassword);


    /**
     * 用户登录
     * @param account
     * @param userPassword
     * @return
     */
    int userLogin(String account, String userPassword);
}
