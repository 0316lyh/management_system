package com.lyh.exception;

/**
 * 业务异常类
 * @author :liangyuhang1
 * @className :SystemException
 * @date :2023/6/7/22:20
 */
public class BusinessException extends RuntimeException {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public BusinessException(int code) {
        this.code = code;
    }

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }


}
