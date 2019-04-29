package cn.plasticlove.order.service.impl;


import cn.plasticlove.order.dao.OrderDetailDao;
import cn.plasticlove.order.dao.OrderMasterDao;
import cn.plasticlove.order.dto.OrderDTO;
import cn.plasticlove.order.entity.OrderDetail;
import cn.plasticlove.order.entity.OrderMaster;
import cn.plasticlove.order.enums.OrderStatusEnum;
import cn.plasticlove.order.enums.PayStatusEnum;
import cn.plasticlove.order.service.OrderService;
import cn.plasticlove.order.util.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Autowired
    private OrderMasterDao orderMasterDao;

    // @Autowired
    // private ProductClient productClient;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        String orderId = KeyUtil.genUniqueKey();

       // //查询商品信息(调用商品服务)
       //  List<String> productIdList = orderDTO.getOrderDetailList().stream()
       //          .map(OrderDetail::getProductId)
       //          .collect(Collectors.toList());
       //  List<ProductInfoOutput> productInfoList = productClient.listForOrder(productIdList);
       //
       // //计算总价
       //  BigDecimal orderAmout = new BigDecimal(BigInteger.ZERO);
       //  for (OrderDetail orderDetail: orderDTO.getOrderDetailList()) {
       //      for (ProductInfoOutput productInfo: productInfoList) {
       //          if (productInfo.getProductId().equals(orderDetail.getProductId())) {
       //              //单价*数量
       //              orderAmout = productInfo.getProductPrice()
       //                      .multiply(new BigDecimal(orderDetail.getProductQuantity()))
       //                      .add(orderAmout);
       //              BeanUtils.copyProperties(productInfo, orderDetail);
       //              orderDetail.setOrderId(orderId);
       //              orderDetail.setDetailId(KeyUtil.genUniqueKey());
       //              //订单详情入库
       //              orderDetailDao.saveOrderDetail(orderDetail);
       //          }
       //      }
       //  }
       //
       // //扣库存(调用商品服务)
       //  List<DecreaseStockInput> decreaseStockInputList = orderDTO.getOrderDetailList().stream()
       //          .map(e -> new DecreaseStockInput(e.getProductId(), e.getProductQuantity()))
       //          .collect(Collectors.toList());
       //  productClient.decreaseStock(decreaseStockInputList);

        //订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(orderId);
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMasterDao.saveOrderMaster(orderMaster);
        return orderDTO;
    }
}
