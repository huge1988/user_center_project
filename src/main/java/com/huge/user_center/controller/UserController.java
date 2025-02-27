package com.huge.user_center.controller;

import com.huge.user_center.commom.BaseResponse;
import com.huge.user_center.commom.ErrorCode;
import com.huge.user_center.commom.ResultUtil;
import com.huge.user_center.exception.BusinessException;
import com.huge.user_center.model.domain.User;
import com.huge.user_center.model.dto.UserLoginRequest;
import com.huge.user_center.model.dto.UserRegisterRequest;
import com.huge.user_center.service.UserService;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * UserController
 *
 * @author Administrator
 * @since 2025-02-12 22:53
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @PostMapping("/register")
    public BaseResponse<User> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        if (userRegisterRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        if (userAccount == null || userPassword == null || checkPassword == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        if (StringUtils.isAnyBlank(userAccount, userPassword, checkPassword)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        User user = userService.userRegister(userAccount, userPassword, checkPassword);

        return ResultUtil.success(user);
    }


    @PostMapping("/login")
    public BaseResponse<User> userLogin(@RequestBody UserLoginRequest userLoginRequest) {


        return ResultUtil.success(new User());
    }

    @PostMapping("/list")
    public List<User> userList() {


        return Collections.emptyList();
    }


}
