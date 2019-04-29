package cn.plasticlove.product.service;

import cn.plasticlove.product.entity.ProductCategory;


import java.util.List;

/**
 * The interface Category service.
 */
public interface CategoryService {
    /**
     * Find by category type in list.
     *
     * @param categoryTypeList the category type list
     * @return the list
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
