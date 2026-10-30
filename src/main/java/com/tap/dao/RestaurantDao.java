package com.tap.dao;

import java.util.List;

import com.tap.model.Restaurant;

public interface RestaurantDao {
    public List<Restaurant> getAllRestaurants();

    void addRestaurant(Restaurant restaurant);

    Restaurant getRestaurant(int restaurantId);

    void updateRestaurant(Restaurant restaurant);

    void deleteRestaurant(int restaurantId);

   
}