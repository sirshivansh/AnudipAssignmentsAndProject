package com.anudip.org.dao;

import java.util.List;
import com.anudip.org.dto.OrderDTO;

public interface OrderDao {

    boolean placeOrder(OrderDTO order);
    List<OrderDTO> showAllOrders();
    OrderDTO searchOrderById(int orderId);
    List<OrderDTO> showUserOrders(String userEmail);
}
