package com.huge.user_center.exception;

import com.huge.user_center.commom.BaseResponse;
import com.huge.user_center.commom.ErrorCode;
import com.huge.user_center.commom.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * GlobalException
 *
 * @description 全局异常
 * @author Administrator
 * @since 2025-02-27 22:31
 */
@RestControllerAdvice
@Slf4j
public class GlobalException {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException e) {
        log.error("RuntimeException: " + e.getMessage(), e);
        return ResultUtil.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse businessExceptionHandler(Exception e) {
        log.error("RuntimeException: " + e.getMessage(), e);
        return ResultUtil.error(ErrorCode.SYSTEM_ERROR, e.getMessage());
    }

}
