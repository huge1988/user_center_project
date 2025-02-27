package com.huge.user_center.commom;

/**
 * ErrorCode
 *
 * @author Administrator
 * @since 2025-02-27 22:15
 */

public enum ErrorCode {

    SUCCESS(0, "ok", ""),
    PARAMS_ERROR(40000, "请求参数错误", "请检查入参"),
    ACCOUNT_PWD_NOT_EXIST(40001, "用户不存在或密码错误",""),
    ACCOUNT_EXIST(40002, "账号已存在", ""),
    NO_AUTH(40003, "无权限" , ""),
    NOT_LOGIN(40004, "未登录" , ""),
    SYSTEM_ERROR(50000, "系统内部异常" , ""),
    OPERATION_ERROR(50001, "操作失败" , "");

    private final int code;

    private final String message;

    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

}
