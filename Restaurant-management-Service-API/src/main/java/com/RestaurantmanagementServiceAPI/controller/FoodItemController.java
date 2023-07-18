package com.RestaurantmanagementServiceAPI.controller;

import com.RestaurantmanagementServiceAPI.model.FoodItem;
import com.RestaurantmanagementServiceAPI.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;
    @PostMapping("addfooditem")
    public String addAllFoodItems(@RequestBody List<FoodItem> foodItem){

        return foodItemService.addAllFoodItems(foodItem);
    }
}