package com.huge.user_center.exception;

import com.huge.user_center.commom.ErrorCode;

/**
 * BusinessException
 *
 * 自定义异常
 * @author Administrator
 * @since 2025-02-27 22:30
 */

public class BusinessException extends RuntimeException {

    /**
     * 状态码
     */
    private final int code;

    /**
     * 描述
     */
    private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
