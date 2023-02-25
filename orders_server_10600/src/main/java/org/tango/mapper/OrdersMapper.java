package org.tango.mapper;

import org.tango.po.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface OrdersMapper {


    int createOrders(Orders orders);

    Orders getOrdersById(Integer orderId);

    List<Orders> listOrdersByUserId(String userId);

    @Update("update orders set orderState=1 where orderId=#{orderId}")
    int updateOrderStateById(Integer orderId);


}
