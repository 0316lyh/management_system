package com.lyh.controller.result;

import com.lyh.controller.result.Code;
import com.lyh.controller.result.Result;
import com.lyh.exception.BusinessException;
import com.lyh.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author :liangyuhang1
 * 异常处理器类
 * @className :ProjectExceptionAdvice
 * @date :2023/3/19/22:58
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员, e对象发送给开发人员
        System.out.println(e);
        return new Result(e.getCode(), null, e.getMessage());
    }

    //业务异常
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e) {
        System.out.println(e);
        return new Result(e.getCode(), null, e.getMessage());
    }

    //其他异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员, e对象发送给开发人员
        System.out.println(e);
        return new Result(Code.SYSTEM_UNKNOW_ERR, null, "系统繁忙, 请稍后再试! --- " + e.getMessage());
    }
}
