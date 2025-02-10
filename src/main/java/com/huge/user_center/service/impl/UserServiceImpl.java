package com.huge.user_center.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huge.user_center.mapper.UserMapper;
import com.huge.user_center.model.domain.User;
import com.huge.user_center.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-02-10 22:09:45
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}




