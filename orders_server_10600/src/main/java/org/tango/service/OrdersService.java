package org.tango.service;

import org.tango.po.Orders;

import java.util.List;

public interface OrdersService {
    int createOrders(String userId, Integer businessId, Integer daId, double orderTotal);

    Orders getOrdersById(Integer orderId);

    int updateOrderStateById(Integer orderId);

    List<Orders> listOrdersByUserId(String userId);
}