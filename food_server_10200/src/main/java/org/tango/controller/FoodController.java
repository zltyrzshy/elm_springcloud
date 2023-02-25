package org.tango.controller;

import org.tango.po.CommonResult;
import org.tango.po.Food;
import org.tango.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/FoodController")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping("/listFoodByBusinessId/{businessId}")
    public CommonResult<List<Food>> listFoodByBusinessId(@PathVariable("businessId") Integer
                                                                 businessId) {
        List<Food> list = foodService.listFoodByBusinessId(businessId);
        return new CommonResult<>(200, "success", list);
    }
}
