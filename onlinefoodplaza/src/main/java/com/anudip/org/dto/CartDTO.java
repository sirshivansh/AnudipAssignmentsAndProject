package com.anudip.org.dto;

public class CartDTO {

    private int cartId;
    private int foodId;
    private String foodName;
    private String userEmail;
    private int quantity;
    private double price;

    public CartDTO() {
        super();
    }

    public CartDTO(int cartId, int foodId, String foodName, String userEmail, int quantity, double price) {
        super();
        this.cartId = cartId;
        this.foodId = foodId;
        this.foodName = foodName;
        this.userEmail = userEmail;
        this.quantity = quantity;
        this.price = price;
    }

    public CartDTO(int foodId, String userEmail, int quantity) {
        super();
        this.foodId = foodId;
        this.userEmail = userEmail;
        this.quantity = quantity;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "CartDTO [cartId=" + cartId + ", foodId=" + foodId + ", foodName=" + foodName + ", userEmail="
                + userEmail + ", quantity=" + quantity + ", price=" + price + ", total=" + getTotalPrice() + "]";
    }
}
