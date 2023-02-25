package org.tango.controller;

import org.tango.po.Cart;
import org.tango.po.CommonResult;
import org.tango.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/CartController")
public class CartController {
    @Autowired
    private CartService cartService;

//    @GetMapping("/listCart/{userId}")
//    public CommonResult<List<Cart>> listCart(@PathVariable("userId") String userId) {
//        return new CommonResult<>(200, "success", cartService.listCart(userId));
//    }

    @GetMapping("/listCart/{userId}/{businessId}")
    public CommonResult<List<Cart>> listCart(
            @PathVariable("userId") String userId,
            @PathVariable("businessId") Integer businessId) {
        return new CommonResult<>(200, "success", cartService.listCart(businessId, userId));
    }

    @PostMapping("/saveCart/{userId}/{businessId}/{foodId}")
    public CommonResult<Integer> saveCart(
            @PathVariable("userId") String userId,
            @PathVariable("businessId") Integer businessId,
            @PathVariable("foodId") Integer foodId) {
        return new CommonResult<>(200, "success", cartService.saveCart(foodId, businessId, userId));
    }

    @PutMapping("/updateCart/{userId}/{businessId}/{foodId}/{quantity}")
    public CommonResult<Integer> updateCart(
            @PathVariable("userId") String userId,
            @PathVariable("businessId") Integer businessId,
            @PathVariable("foodId") Integer foodId,
            @PathVariable("quantity") Integer quantity) {
        return new CommonResult<>(200, "success", cartService.updateCart(quantity, foodId, businessId, userId));
    }

    @DeleteMapping("/removeCart/{userId}/{businessId}/{foodId}")
    public CommonResult<Integer> removeCart(
            @PathVariable("userId") String userId,
            @PathVariable("businessId") Integer businessId,
            @PathVariable("foodId") Integer foodId) {

        return new CommonResult<>(200, "success", cartService.removeCart(foodId, businessId, userId));
    }
}