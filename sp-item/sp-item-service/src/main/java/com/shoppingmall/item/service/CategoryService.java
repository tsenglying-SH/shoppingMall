package com.shoppingmall.item.service;

import com.shoppingmall.common.enums.ExceptionEnum;
import com.shoppingmall.common.exception.SpException;
import com.shoppingmall.item.mapper.CategoryMapper;
import com.shoppingmall.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * @ClassName CategoryService
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/6 20:53
 * @Version 1.0
 **/
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryGategoryByPid(Long pid){
        Category category = new Category();
        category.setParentId(pid);
        List<Category> list = categoryMapper.select(category);
        if(CollectionUtils.isEmpty(list)){
            throw new SpException(ExceptionEnum.CATGORY_NOT_FOUND);
        }
        return list;
    }
}
