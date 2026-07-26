package com.anudip.org.service.impl;

import java.util.List;
import com.anudip.org.dao.FoodDao;
import com.anudip.org.dao.impl.FoodDaoImpl;
import com.anudip.org.dto.FoodDTO;
import com.anudip.org.service.FoodService;

public class FoodServiceImpl implements FoodService {

    private FoodDao foodDao = new FoodDaoImpl();

    @Override
    public boolean addFood(FoodDTO food) {
        return foodDao.addFood(food);
    }

    @Override
    public boolean updateFood(FoodDTO food) {
        return foodDao.updateFood(food);
    }

    @Override
    public boolean deleteFood(int foodId) {
        return foodDao.deleteFood(foodId);
    }

    @Override
    public List<FoodDTO> showAllFood() {
        return foodDao.showAllFood();
    }

    @Override
    public FoodDTO searchFoodById(int foodId) {
        return foodDao.searchFoodById(foodId);
    }

    @Override
    public List<FoodDTO> searchFoodByName(String name) {
        return foodDao.searchFoodByName(name);
    }
}
