package com.anudip.org.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.anudip.org.dao.FoodDao;
import com.anudip.org.dto.FoodDTO;
import com.anudip.org.utility.DbConnection;

public class FoodDaoImpl implements FoodDao {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean addFood(FoodDTO food) {
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("insert into tbl_food(food_name, food_type, category, price) values(?,?,?,?)");
            ps.setString(1, food.getFoodName());
            ps.setString(2, food.getFoodType());
            ps.setString(3, food.getCategory());
            ps.setDouble(4, food.getPrice());
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateFood(FoodDTO food) {
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("update tbl_food set food_name=?, food_type=?, category=?, price=? where food_id=?");
            ps.setString(1, food.getFoodName());
            ps.setString(2, food.getFoodType());
            ps.setString(3, food.getCategory());
            ps.setDouble(4, food.getPrice());
            ps.setInt(5, food.getFoodId());
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteFood(int foodId) {
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("delete from tbl_food where food_id=?");
            ps.setInt(1, foodId);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<FoodDTO> showAllFood() {
        List<FoodDTO> foodList = new ArrayList<>();
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("select * from tbl_food");
            rs = ps.executeQuery();
            while (rs.next()) {
                FoodDTO food = new FoodDTO(
                    rs.getInt("food_id"),
                    rs.getString("food_name"),
                    rs.getString("food_type"),
                    rs.getString("category"),
                    rs.getDouble("price")
                );
                foodList.add(food);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return foodList;
    }

    @Override
    public FoodDTO searchFoodById(int foodId) {
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("select * from tbl_food where food_id=?");
            ps.setInt(1, foodId);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new FoodDTO(
                    rs.getInt("food_id"),
                    rs.getString("food_name"),
                    rs.getString("food_type"),
                    rs.getString("category"),
                    rs.getDouble("price")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<FoodDTO> searchFoodByName(String name) {
        List<FoodDTO> foodList = new ArrayList<>();
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("select * from tbl_food where food_name like ?");
            ps.setString(1, "%" + name + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                FoodDTO food = new FoodDTO(
                    rs.getInt("food_id"),
                    rs.getString("food_name"),
                    rs.getString("food_type"),
                    rs.getString("category"),
                    rs.getDouble("price")
                );
                foodList.add(food);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return foodList;
    }
}
