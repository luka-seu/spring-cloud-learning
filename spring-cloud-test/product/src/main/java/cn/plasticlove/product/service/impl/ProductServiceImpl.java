package cn.plasticlove.product.service.impl;

import cn.plasticlove.product.common.ProductStatusEnum;
import cn.plasticlove.product.common.ResultEnum;
import cn.plasticlove.product.dao.ProductInfoDao;
import cn.plasticlove.product.dto.CartDTO;
import cn.plasticlove.product.entity.ProductInfo;
import cn.plasticlove.product.exception.SellException;
import cn.plasticlove.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO: cartDTOList) {
            ProductInfo productInfo = productInfoDao.findProductInfoById(cartDTO.getProductId());
            if (productInfo == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
            if (result < 0) {
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            productInfo.setProductStock(result);

            productInfoDao.updateStock(productInfo);
        }
    }

    @Override
    public List<ProductInfo> findList(List<String> productIdList) {
        return productInfoDao.findByProductIdIn(productIdList);
    }
}
