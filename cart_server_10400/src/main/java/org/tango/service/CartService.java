package org.tango.service;


import org.tango.po.Cart;

import java.util.List;

public interface CartService {
    List<Cart> listCart(Integer businessId, String userId);
//
//    List<Cart> listCart(String userId);


    int saveCart(Integer foodId, Integer businessId, String userId);

    int updateCart(Integer quantity, Integer foodId, Integer businessId, String userId);

    int removeCart(Integer foodId, Integer businessId, String userId);
}