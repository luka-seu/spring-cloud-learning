package cn.plasticlove.product.service.impl;

import cn.plasticlove.product.dao.ProductCategoryDao;
import cn.plasticlove.product.entity.ProductCategory;
import cn.plasticlove.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/29-19:25
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    ProductCategoryDao productCategoryDao;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryDao.findByCategoryTypeIn(categoryTypeList);
    }
}
