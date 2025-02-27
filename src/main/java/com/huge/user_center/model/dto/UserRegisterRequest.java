package com.huge.user_center.model.dto;

import lombok.Data;

/**
 * UserRegisterRequest
 *
 * @author Administrator
 * @since 2025-02-27 22:40
 */

@Data
public class UserRegisterRequest {

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
