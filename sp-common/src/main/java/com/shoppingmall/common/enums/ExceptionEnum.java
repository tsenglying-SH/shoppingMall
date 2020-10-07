package com.shoppingmall.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*定义异常的枚举类*/
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ExceptionEnum {


    //枚举必须定义在前面，并且参数顺序与后面参数顺序一致
    PRICE_CANNOT_BE_BULL(400,"价格不能为空"),
    CATGORY_NOT_FOUND(404,"商品分类没查到")
    ;
    private int code;
    private String msg;

}
