package com.example.UserManagementProjectGeekster;

import com.example.UserManagementProjectGeekster.UserManagementProject.UserDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class createObject {
    @Bean("object")
    public UserDetails getUserDetails(){
        return new UserDetails(4356, "apurbanaskarcse", "06-02-1997", "apurbanaskarcse@gmail.com", 95273645, "27-6-2023", "06:00 A.M");
    }
}
