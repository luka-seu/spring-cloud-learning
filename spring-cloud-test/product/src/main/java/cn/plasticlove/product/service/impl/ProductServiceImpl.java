package cn.plasticlove.product.service.impl;

import cn.plasticlove.product.common.ProductStatusEnum;
import cn.plasticlove.product.dao.ProductInfoDao;
import cn.plasticlove.product.entity.ProductInfo;
import cn.plasticlove.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/29-19:15
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductInfoDao productInfoDao;


    @Override
    public List<ProductInfo> getUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
