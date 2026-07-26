package com.anudip.org.service;

import java.util.List;
import com.anudip.org.dto.OrderDTO;

public interface OrderService {

    boolean placeOrder(OrderDTO order);
    List<OrderDTO> showAllOrders();
    OrderDTO searchOrderById(int orderId);
    List<OrderDTO> showUserOrders(String userEmail);
}
