package com.project.Wastelessharvest.Repositery;

import com.project.Wastelessharvest.Entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface FoodItemRepo extends JpaRepository<FoodItem,Integer> {
    List<FoodItem> findByCustomerCustomerId(int customerId);
}

