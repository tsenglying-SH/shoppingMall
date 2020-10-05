package com.shoppingmall.common.exception;

import com.shoppingmall.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ClassName SpException
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/5 10:55
 * @Version 1.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SpException extends RuntimeException {
    public ExceptionEnum exceptionEnum;
}
