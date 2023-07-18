package com.RestaurantmanagementServiceAPI.repository;

import com.RestaurantmanagementServiceAPI.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodItemRepo extends JpaRepository<FoodItem,Long> {
}
