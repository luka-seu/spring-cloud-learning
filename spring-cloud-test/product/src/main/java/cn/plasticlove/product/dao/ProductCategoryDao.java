package cn.plasticlove.product.dao;



import cn.plasticlove.product.entity.ProductCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductCategoryDao {

    List<ProductCategory> findByCategoryTypeIn(@Param("categoryTypeList") List<Integer> categoryTypeList);
}
