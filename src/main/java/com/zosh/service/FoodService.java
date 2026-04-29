package com.zosh.service;

import com.zosh.model.Category;
import com.zosh.model.Food;
import com.zosh.model.Restaurant;
import com.zosh.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {
    Food createFood(CreateFoodRequest request, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;

    List<Food> getRestaurantsFood(Long restaurantId,
                                  boolean isVegitarian,
                                  boolean isNonveg,
                                  boolean isSeason,
                                  String foodCategory);

    List<Food> searchFood(String keyword);
    Food findFoodById(Long foodId) throws Exception;

    Food updateAvailabilityStatus(Long FoodId) throws Exception;
 }
