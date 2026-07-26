package com.anudip.org.dto;

public class FoodDTO {

    private int foodId;
    private String foodName;
    private String foodType; // Veg / Non-Veg
    private String category; // Starter, Main Course, Dessert, etc.
    private double price;

    public FoodDTO() {
        super();
    }

    public FoodDTO(int foodId, String foodName, String foodType, String category, double price) {
        super();
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodType = foodType;
        this.category = category;
        this.price = price;
    }

    public FoodDTO(String foodName, String foodType, String category, double price) {
        super();
        this.foodName = foodName;
        this.foodType = foodType;
        this.category = category;
        this.price = price;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FoodDTO [foodId=" + foodId + ", foodName=" + foodName + ", foodType=" + foodType + ", category="
                + category + ", price=" + price + "]";
    }
}
