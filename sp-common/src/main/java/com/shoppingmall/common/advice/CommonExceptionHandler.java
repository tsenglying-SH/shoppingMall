package com.shoppingmall.common.advice;

import com.shoppingmall.common.enums.ExceptionEnum;
import com.shoppingmall.common.exception.SpException;
import com.shoppingmall.common.vo.ExceptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName CommonExceptionHandler
 * @Description 通用异常处理
 * @Author Tsenglying
 * @Date 2020/10/5 10:40
 * @Version 1.0
 **/
@ControllerAdvice
public class CommonExceptionHandler {

    //拦截runtiomeException异常
    @ExceptionHandler(SpException.class)
    public ResponseEntity<ExceptionResult> handleException(SpException e){
        ExceptionEnum em = e.getExceptionEnum();
        return ResponseEntity.status(em.getCode())
                .body(new ExceptionResult(em));
    }
}
