package com.huge.user_center.commom;

/**
 * ResultUtil
 *
 * @author Administrator
 * @since 2025-02-27 22:14
 */

public class ResultUtil {

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");


    }

    public static <T> BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    public static <T> BaseResponse<T> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }

    public static <T> BaseResponse<T> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }


}
