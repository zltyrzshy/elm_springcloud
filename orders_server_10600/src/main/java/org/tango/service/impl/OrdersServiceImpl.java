package org.tango.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tango.mapper.CartMapper;
import org.tango.mapper.OrderDetailMapper;
import org.tango.mapper.OrdersMapper;
import org.tango.po.Cart;
import org.tango.po.OrderDetail;
import org.tango.po.Orders;
import org.tango.service.OrdersService;
import org.tango.util.CommonUtil;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    @Transactional
    public int createOrders(String userId, Integer businessId, Integer daId, double orderTotal) {
        //1.查询当前用户购物车中当前商家的所有食品
        List<Cart> cartList = cartMapper.listCart(businessId, userId);
        //2、创建订单（返回生成的订单编号）
        Orders orders = new Orders(userId, businessId, daId, orderTotal, CommonUtil.getCurrentDate());
        ordersMapper.createOrders(orders);
        int orderId = orders.getOrderId();
        //3、批量添加订单明细
        List<OrderDetail> list = new ArrayList<>();
        for (Cart c : cartList) {
            OrderDetail od = new OrderDetail();
            od.setOrderId(orderId);
            od.setFoodId(c.getFoodId());
            od.setQuantity(c.getQuantity());
            list.add(od);
        }
        orderDetailMapper.saveOrderDetailBatch(list);

        //创建订单后删除购物车
        cartMapper.removeCart(null, businessId, userId);

        return orderId;
    }


    @Override
    public Orders getOrdersById(Integer orderId) {
        return ordersMapper.getOrdersById(orderId);
    }

    @Override
    public int updateOrderStateById(Integer orderId) {
        return ordersMapper.updateOrderStateById(orderId);
    }

    @Override
    public List<Orders> listOrdersByUserId(String userId) {
        return ordersMapper.listOrdersByUserId(userId);
    }


}
