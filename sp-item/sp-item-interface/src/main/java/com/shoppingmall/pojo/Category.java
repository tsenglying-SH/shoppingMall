package com.shoppingmall.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="tb_category")

/*@Table声明此对象映射到数据库的数据表，通过它可以为实体指定表*/

@Data
public class Category {
	@Id
	/*@Id 标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，
	可与声明语句同行，也可写在单独行上。*/

	@KeySql(useGeneratedKeys=true)
	/*把新增加的主键赋值到自己定义的keyProperty（id）中*/

	private Long id;
	private String name;
	private Long parentId;
	private Boolean isParent;
	private Integer sort;
	// getter和setter略
    // 注意isParent的get和set方法
}