package cn.plasticlove.order;

import cn.plasticlove.order.dao.OrderDetailDao;
import cn.plasticlove.order.dao.OrderMasterDao;
import cn.plasticlove.order.entity.OrderDetail;
import cn.plasticlove.order.entity.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderApplicationTests {

    @Autowired
    OrderDetailDao orderDetailDao;

    @Autowired
    OrderMasterDao orderMasterDao;

    @Test
    public void testDetail() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1");
        orderDetail.setOrderId("2");
        orderDetail.setProductId("4");
        orderDetail.setProductName("testProduct");
        orderDetail.setProductPrice(new BigDecimal(25.63));
        orderDetail.setProductQuantity(5);
        orderDetail.setProductIcon("test");
        orderDetailDao.saveOrderDetail(orderDetail);

    }


    @Test
    public void testMaster() {
      OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1");
        orderMaster.setBuyerName("xiaoming");
        orderMaster.setBuyerPhone("13256478989");
        orderMaster.setBuyerAddress("江苏省南京市");
        orderMaster.setBuyerOpenid("82329423932044342");
        orderMaster.setOrderAmount(new BigDecimal(234));
        orderMaster.setOrderStatus(0);
        orderMaster.setPayStatus(1);
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());
        orderMasterDao.saveOrderMaster(orderMaster);

    }

}
