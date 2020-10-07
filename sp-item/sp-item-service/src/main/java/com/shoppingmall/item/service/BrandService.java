package com.shoppingmall.item.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shoppingmall.common.enums.ExceptionEnum;
import com.shoppingmall.common.exception.SpException;
import com.shoppingmall.common.vo.PageResult;
import com.shoppingmall.item.mapper.BrandMapper;
import com.shoppingmall.pojo.Brand;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassName BrandService
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/7 10:52
 * @Version 1.0
 **/
@Service
public class BrandService {
    @Autowired
    private BrandMapper brandMapper;

    public PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String key) {

        Example example = new Example(Brand.class);
        //分页(利用分页助手)
        PageHelper.startPage(page, rows);

        //过滤
        // where name like "%x%" or letter =='x'
        if (StringUtils.isNotBlank(key)) {
            example.createCriteria().andLike("name", "%" + key + "%")
                    .orEqualTo("letter", key.toUpperCase());
        }
        //排序
        if (StringUtils.isNotBlank(sortBy)) {
            String orderByClause = sortBy + (desc ? " DESC" : " ASC");
            example.setOrderByClause(orderByClause);
        }
        //查询
        List<Brand> list = brandMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list)) {
            throw new SpException(ExceptionEnum.BRAND_NOT_EXIST);
        }
        PageInfo<Brand> brandPageInfo = new PageInfo<>(list);
        return new PageResult<>(brandPageInfo.getTotal(), list);
    }


    @Transactional
    public void saveBrand(Brand brand, List<Long> cids) {
        brand.setId(null);
        int insert = brandMapper.insert(brand);
        if(insert!=1) {
            throw new SpException(ExceptionEnum.BRAND_SAVE_ERROR);
        }
        for (Long cid : cids) {
            int count = brandMapper.insertBrandAndCategory(cid, brand.getId());
            if(count!=1){
                throw new SpException(ExceptionEnum.BRAND_SAVE_ERROR);
            }
        }
    }
}
