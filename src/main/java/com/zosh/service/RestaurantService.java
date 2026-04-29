package com.zosh.service;

import com.zosh.dto.RestaurantDto;
import com.zosh.model.Restaurant;
import com.zosh.model.User;
import com.zosh.request.CreateRestaurantRequest;

import java.util.List;

public interface RestaurantService {
    public Restaurant createRestaurant(CreateRestaurantRequest request, User user);
    public Restaurant updateRestaurant(Long id, CreateRestaurantRequest updateRestaurantRequest) throws Exception;
    public void deleteRestaurant(Long id) throws Exception;

    public List<Restaurant> getAllRestaurants();
    public List<Restaurant> searchRestaurants(String keyword);
    public Restaurant findRestaurantById(Long id) throws Exception;
    public Restaurant getRestaurantByUserId(Long userId) throws Exception;
    public RestaurantDto addToFavorites(Long restaurantId, User user) throws Exception;
    public Restaurant updateRestaurantStatus(Long restaurantId) throws Exception;
}
