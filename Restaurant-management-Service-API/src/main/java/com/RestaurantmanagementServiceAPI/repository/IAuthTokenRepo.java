package com.RestaurantmanagementServiceAPI.repository;

import com.RestaurantmanagementServiceAPI.model.AuthenticationToken;
import com.RestaurantmanagementServiceAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}
