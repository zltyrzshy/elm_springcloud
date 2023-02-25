package org.tango.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.tango.po.Business;
import org.tango.po.CommonResult;
import org.tango.po.Food;
import org.tango.service.BusinessService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/BusinessController")
public class BusinessController {
    @Autowired
    private BusinessService businessService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/listBusinessByOrderTypeId/{orderTypeId}")
    public CommonResult<List<Business>> listBusinessByOrderTypeId(@PathVariable("orderTypeId") Integer orderTypeId) {
        List<Business> list = businessService.listBusinessByOrderTypeId(orderTypeId);
        return new CommonResult<>(200, "success", list);
    }

    @GetMapping("/getBusinessById/{businessId}")
    public CommonResult<Business> getBusinessById(@PathVariable("businessId") Integer
                                                          businessId) {
        Business business = businessService.getBusinessById(businessId); //在商家微服务中调用食品微服务
        CommonResult<List<Food>> result =
                restTemplate.getForObject("http://localhost:10200/FoodController/listFoodByBusinessId/" + businessId, CommonResult.class);
        assert result != null;
        if (result.getCode() == 200) {
            business.setFoodList(result.getResult());
        }
        return new CommonResult<>(200, "success", business);
    }
}
