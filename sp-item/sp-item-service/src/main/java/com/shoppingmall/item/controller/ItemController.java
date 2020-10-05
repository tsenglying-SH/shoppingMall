package com.shoppingmall.item.controller;

import com.shoppingmall.common.enums.ExceptionEnum;
import com.shoppingmall.common.exception.SpException;
import com.shoppingmall.item.service.ItemService;
import com.shoppingmall.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @ClassName ItemController
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/4 22:17
 * @Version 1.0
 **/
@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @PostMapping
    public ResponseEntity<Item> saveItem(Item item){
        //校验
        if(item.getPrice()==null){
            throw new SpException(ExceptionEnum.PRICE_CANNOT_BE_BULL);
        }
        item =itemService.saveItem(item);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(item);
    }
}
