package com.anudip.org.dto;

import java.sql.Timestamp;

public class OrderDTO {

    private int orderId;
    private String userEmail;
    private double totalAmount;
    private Timestamp orderDate;
    private String orderStatus;

    public OrderDTO() {
        super();
    }

    public OrderDTO(int orderId, String userEmail, double totalAmount, Timestamp orderDate, String orderStatus) {
        super();
        this.orderId = orderId;
        this.userEmail = userEmail;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
    }

    public OrderDTO(String userEmail, double totalAmount) {
        super();
        this.userEmail = userEmail;
        this.totalAmount = totalAmount;
        this.orderStatus = "PLACED";
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "OrderDTO [orderId=" + orderId + ", userEmail=" + userEmail + ", totalAmount=" + totalAmount
                + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + "]";
    }
}
