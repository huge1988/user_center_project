package com.huge.user_center.model.dto;

import lombok.Data;

/**
 * UserLoginRequest
 *
 * @author Administrator
 * @since 2025-02-27 22:51
 */

@Data
public class UserLoginRequest {

    private String userAccount;

    private String userPassword;

}
