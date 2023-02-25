package org.tango.service.impl;


import org.tango.mapper.CartMapper;
import org.tango.po.Cart;
import org.tango.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cart;


    @Override
    public List<Cart> listCart(Integer businessId, String userId) {
        return cart.listCart(businessId, userId);
    }

//    @Override
//    public List<Cart> listCart(String userId) {
//        return cart.listCart(userId);
//    }

    @Override
    public int saveCart(Integer foodId, Integer businessId, String userId) {
        return cart.saveCart(foodId, businessId, userId);
    }

    @Override
    public int updateCart(Integer quantity, Integer foodId, Integer businessId, String userId) {
        return cart.updateCart(quantity, foodId, businessId, userId);
    }

    @Override
    public int removeCart(Integer foodId, Integer businessId, String userId) {
        return cart.removeCart(foodId, businessId, userId);
    }


}
