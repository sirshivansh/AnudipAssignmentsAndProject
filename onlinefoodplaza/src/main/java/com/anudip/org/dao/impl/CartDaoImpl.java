package com.anudip.org.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.anudip.org.dao.CartDao;
import com.anudip.org.dto.CartDTO;
import com.anudip.org.utility.DbConnection;

public class CartDaoImpl implements CartDao {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean addToCart(CartDTO cart) {
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("insert into tbl_cart(food_id, user_email, quantity) values(?,?,?)");
            ps.setInt(1, cart.getFoodId());
            ps.setString(2, cart.getUserEmail());
            ps.setInt(3, cart.getQuantity());
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<CartDTO> showCart(String userEmail) {
        List<CartDTO> cartList = new ArrayList<>();
        try {
            con = DbConnection.makeConnection();
            String sql = "select c.cart_id, c.food_id, f.food_name, c.user_email, c.quantity, f.price " +
                         "from tbl_cart c join tbl_food f on c.food_id = f.food_id where c.user_email = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, userEmail);
            rs = ps.executeQuery();
            while (rs.next()) {
                CartDTO cart = new CartDTO(
                    rs.getInt("cart_id"),
                    rs.getInt("food_id"),
                    rs.getString("food_name"),
                    rs.getString("user_email"),
                    rs.getInt("quantity"),
                    rs.getDouble("price")
                );
                cartList.add(cart);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cartList;
    }

    @Override
    public boolean deleteCartItem(int cartId) {
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("delete from tbl_cart where cart_id=?");
            ps.setInt(1, cartId);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean clearCart(String userEmail) {
        try {
            con = DbConnection.makeConnection();
            ps = con.prepareStatement("delete from tbl_cart where user_email=?");
            ps.setString(1, userEmail);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
