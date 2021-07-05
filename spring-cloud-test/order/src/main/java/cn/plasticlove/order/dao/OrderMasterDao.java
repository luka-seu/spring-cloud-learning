package cn.plasticlove.order.dao;


import cn.plasticlove.order.entity.OrderMaster;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMasterDao{
    public void saveOrderMaster(OrderMaster orderMaster);
}
