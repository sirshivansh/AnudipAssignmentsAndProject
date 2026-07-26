package com.anudip.org.controller;

import java.util.List;
import com.anudip.org.dto.OrderDTO;
import com.anudip.org.service.OrderService;
import com.anudip.org.service.impl.OrderServiceImpl;

public class OrderController {

    private OrderService orderService = new OrderServiceImpl();

    public boolean placeOrder(OrderDTO order) {
        return orderService.placeOrder(order);
    }

    public List<OrderDTO> showAllOrders() {
        return orderService.showAllOrders();
    }

    public OrderDTO searchOrderById(int orderId) {
        return orderService.searchOrderById(orderId);
    }

    public List<OrderDTO> showUserOrders(String userEmail) {
        return orderService.showUserOrders(userEmail);
    }
}
