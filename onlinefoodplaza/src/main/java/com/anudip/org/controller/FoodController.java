package com.anudip.org.controller;

import java.util.List;
import com.anudip.org.dto.FoodDTO;
import com.anudip.org.service.FoodService;
import com.anudip.org.service.impl.FoodServiceImpl;

public class FoodController {

    private FoodService foodService = new FoodServiceImpl();

    public boolean addFood(FoodDTO food) {
        return foodService.addFood(food);
    }

    public boolean updateFood(FoodDTO food) {
        return foodService.updateFood(food);
    }

    public boolean deleteFood(int foodId) {
        return foodService.deleteFood(foodId);
    }

    public List<FoodDTO> showAllFood() {
        return foodService.showAllFood();
    }

    public FoodDTO searchFoodById(int foodId) {
        return foodService.searchFoodById(foodId);
    }

    public List<FoodDTO> searchFoodByName(String name) {
        return foodService.searchFoodByName(name);
    }
}
