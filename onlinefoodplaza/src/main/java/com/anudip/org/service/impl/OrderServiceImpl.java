package com.anudip.org.service.impl;

import java.util.List;
import com.anudip.org.dao.OrderDao;
import com.anudip.org.dao.impl.OrderDaoImpl;
import com.anudip.org.dto.OrderDTO;
import com.anudip.org.service.OrderService;

public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao = new OrderDaoImpl();

    @Override
    public boolean placeOrder(OrderDTO order) {
        return orderDao.placeOrder(order);
    }

    @Override
    public List<OrderDTO> showAllOrders() {
        return orderDao.showAllOrders();
    }

    @Override
    public OrderDTO searchOrderById(int orderId) {
        return orderDao.searchOrderById(orderId);
    }

    @Override
    public List<OrderDTO> showUserOrders(String userEmail) {
        return orderDao.showUserOrders(userEmail);
    }
}
