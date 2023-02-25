package org.tango.service;

import org.tango.po.Food;

import java.util.List;

public interface FoodService {
    List<Food> listFoodByBusinessId(Integer businessId);
}
