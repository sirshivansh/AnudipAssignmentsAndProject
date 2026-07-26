package com.anudip.org.dao;

import java.util.List;
import com.anudip.org.dto.FoodDTO;

public interface FoodDao {

    boolean addFood(FoodDTO food);
    boolean updateFood(FoodDTO food);
    boolean deleteFood(int foodId);
    List<FoodDTO> showAllFood();
    FoodDTO searchFoodById(int foodId);
    List<FoodDTO> searchFoodByName(String name);
}
