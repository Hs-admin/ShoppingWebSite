package com.gys.service;

import com.gys.po.Product;

import java.util.List;

public interface ProductService {
    /**
     *
     * 查询全部
     * @return
     */
    List<Product> selectAll();

    /**
     * 根据id查询
     * @return
     */
    Product selectOne(int id);

    /**
     *
     * @param product
     * @return
     */
    int insert(Product product);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 修改
     * @param product
     * @return
     */
    int update(Product product);

}
