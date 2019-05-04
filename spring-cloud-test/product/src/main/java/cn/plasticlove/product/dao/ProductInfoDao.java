package cn.plasticlove.product.dao;



import cn.plasticlove.product.entity.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductInfoDao {

    List<ProductInfo> findByProductStatus(@Param("productStatus") Integer productStatus);

    List<ProductInfo> findByProductIdIn(@Param("productIdList") List<String> productIdList);

    ProductInfo findProductInfoById(@Param("productId")String productId);

    void saveProductInfo(ProductInfo productInfo);
    void updateStock(ProductInfo productInfo);

}
