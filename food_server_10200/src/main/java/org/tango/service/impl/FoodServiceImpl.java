package org.tango.service.impl;


import org.tango.mapper.FoodMapper;
import org.tango.po.Food;
import org.tango.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<Food> listFoodByBusinessId(Integer businessId) {
        return foodMapper.listFoodByBusinessId(businessId);
    }


}
