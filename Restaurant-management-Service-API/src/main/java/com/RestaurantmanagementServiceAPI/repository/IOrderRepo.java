package com.RestaurantmanagementServiceAPI.repository;

import com.RestaurantmanagementServiceAPI.model.Order;
import com.RestaurantmanagementServiceAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Long> {
    Order findFirstByUser(User user);
}