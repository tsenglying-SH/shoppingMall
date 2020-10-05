package com.shoppingmall.item.service;

import com.shoppingmall.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @ClassName ItemService
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/4 21:08
 * @Version 1.0
 **/
@Service
public class ItemService {
    public Item saveItem(Item item){
        int id= new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}
