package cn.plasticlove.product.service;

import cn.plasticlove.product.dto.CartDTO;
import cn.plasticlove.product.entity.ProductInfo;

import java.util.List;

/**
 * The interface Product service.
 */


public interface ProductService {

    /**
     * Gets up all.
     *
     * @return the up all
     */
    public List<ProductInfo> getUpAll();

    /**
     * Decrease stock.
     *
     * @param cartDTOList the cart dto list
     */
    public void decreaseStock(List<CartDTO> cartDTOList);

    List<ProductInfo> findList(List<String> productIdList);

}
