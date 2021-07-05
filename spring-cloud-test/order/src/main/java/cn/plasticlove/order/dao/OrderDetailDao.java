package cn.plasticlove.order.dao;


import cn.plasticlove.order.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailDao {
    public int saveOrderDetail(OrderDetail orderDetail);
}
