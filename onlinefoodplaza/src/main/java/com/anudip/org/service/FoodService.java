package com.anudip.org.service;

import java.util.List;
import com.anudip.org.dto.FoodDTO;

public interface FoodService {

    boolean addFood(FoodDTO food);
    boolean updateFood(FoodDTO food);
    boolean deleteFood(int foodId);
    List<FoodDTO> showAllFood();
    FoodDTO searchFoodById(int foodId);
    List<FoodDTO> searchFoodByName(String name);
}
