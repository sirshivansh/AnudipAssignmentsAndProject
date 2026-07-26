package com.anudip.org.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.anudip.org.dao.OrderDao;
import com.anudip.org.dto.OrderDTO;
import com.anudip.org.utility.DbConnection;

public class OrderDaoImpl implements OrderDao {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean placeOrder(OrderDTO order) {
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("insert into tbl_order(user_email, total_amount, order_status) values(?,?,?)");
            ps.setString(1, order.getUserEmail());
            ps.setDouble(2, order.getTotalAmount());
            ps.setString(3, order.getOrderStatus() != null ? order.getOrderStatus() : "PLACED");
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<OrderDTO> showAllOrders() {
        List<OrderDTO> orderList = new ArrayList<>();
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("select * from tbl_order order by order_date desc");
            rs = ps.executeQuery();
            while (rs.next()) {
                OrderDTO order = new OrderDTO(
                    rs.getInt("order_id"),
                    rs.getString("user_email"),
                    rs.getDouble("total_amount"),
                    rs.getTimestamp("order_date"),
                    rs.getString("order_status")
                );
                orderList.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderList;
    }

    @Override
    public OrderDTO searchOrderById(int orderId) {
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("select * from tbl_order where order_id=?");
            ps.setInt(1, orderId);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new OrderDTO(
                    rs.getInt("order_id"),
                    rs.getString("user_email"),
                    rs.getDouble("total_amount"),
                    rs.getTimestamp("order_date"),
                    rs.getString("order_status")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<OrderDTO> showUserOrders(String userEmail) {
        List<OrderDTO> orderList = new ArrayList<>();
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("select * from tbl_order where user_email=? order by order_date desc");
            ps.setString(1, userEmail);
            rs = ps.executeQuery();
            while (rs.next()) {
                OrderDTO order = new OrderDTO(
                    rs.getInt("order_id"),
                    rs.getString("user_email"),
                    rs.getDouble("total_amount"),
                    rs.getTimestamp("order_date"),
                    rs.getString("order_status")
                );
                orderList.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderList;
    }
}
