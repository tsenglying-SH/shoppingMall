package com.shoppingmall.pojo;
import lombok.Data;

@Data
public class Item {
    private Integer id;
    private String name;
    private Long price;

    /*public void setId(Integer id) {
        this.id = id;
    }*/
}
