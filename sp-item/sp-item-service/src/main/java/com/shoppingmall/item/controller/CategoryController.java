package com.shoppingmall.item.controller;

import com.shoppingmall.item.service.CategoryService;
import com.shoppingmall.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName CategoryController
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/6 20:55
 * @Version 1.0
 **/
@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
/*-  根据父节点id查询商品分类
  请求方式：Get
- 请求路径：/api/item/category/list。其中/api是网关前缀，/item是网关的路由映射，真实的路径应该是/category/list
- 请求参数：pid=0，根据tree组件的说明，应该是父节点的id，第一次查询为0，那就是查询一级类目
- 返回结果：？？*/
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryGategoryByPid(@RequestParam("pid") Long pid){
        return ResponseEntity.ok(categoryService.queryGategoryByPid(pid));
    }

}
