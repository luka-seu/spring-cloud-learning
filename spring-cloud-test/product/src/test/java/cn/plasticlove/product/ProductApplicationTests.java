package cn.plasticlove.product;

import cn.plasticlove.product.dao.ProductCategoryDao;
import cn.plasticlove.product.dao.ProductInfoDao;
import cn.plasticlove.product.entity.ProductCategory;
import cn.plasticlove.product.entity.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {

    @Autowired
    ProductInfoDao productInfoDao;

    @Autowired
    ProductCategoryDao productCategoryDao;

    @Test
    public void testProductInfoDao() {

        List<ProductInfo> list = productInfoDao.findByProductStatus(0);
        for (ProductInfo productInfo:list){
            System.out.println(productInfo);
        }
    }

    @Test
    public void testProductInfoDao2() {

        List<String> idList = Arrays.asList("164103465734242707","157875227953464068","3");

        List<ProductInfo> list = productInfoDao.findByProductIdIn(idList);
        for (ProductInfo productInfo:list){
            System.out.println(productInfo);
        }
    }

    @Test
    public void testProductCategoryDao() {

        List<Integer> idList = Arrays.asList(11,22,3);

        List<ProductCategory> list = productCategoryDao.findByCategoryTypeIn(idList);
        for (ProductCategory info:list){
            System.out.println(info);
        }
    }

}
