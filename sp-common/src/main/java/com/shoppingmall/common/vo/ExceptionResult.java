package com.shoppingmall.common.vo;

import com.shoppingmall.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @ClassName ExceptionResult
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/5 11:45
 * @Version 1.0
 **/
@Data
public class ExceptionResult {
    private int status;
    private String massage;
    private Long timestamp;
    public ExceptionResult(ExceptionEnum em){
        this.status=em.getCode();
        this.massage=em.getMsg();
        this.timestamp=System.currentTimeMillis();
    }
}
