package org.tango.controller;

import org.tango.po.CommonResult;
import org.tango.po.Orders;
import org.tango.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/OrdersController")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @PostMapping("/createOrders/{userId}/{businessId}/{daId}/{orderTotal}")
    public CommonResult<Integer> createOrders(
            @PathVariable("userId") String userId,
            @PathVariable("businessId") Integer businessId,
            @PathVariable("daId") Integer daId,
            @PathVariable("orderTotal") Double orderTotal) {
        return new CommonResult<>(200, "success(10600)", ordersService.createOrders(userId, businessId, daId, orderTotal));
    }

    @GetMapping("/getOrdersById/{orderId}")
    public CommonResult<Orders> getOrdersById(
            @PathVariable("orderId") Integer orderId) {
        Orders orders = ordersService.getOrdersById(orderId);
        return new CommonResult<>(200, "success(10600)", orders);
    }

    @GetMapping("/listOrdersByUserId/{userId}")
    public CommonResult<List<Orders>> listOrdersByUserId(
            @PathVariable("userId") String userId) {
        List<Orders> list = ordersService.listOrdersByUserId(userId);
        return new CommonResult<>(200, "success(10600)", list);
    }
}
