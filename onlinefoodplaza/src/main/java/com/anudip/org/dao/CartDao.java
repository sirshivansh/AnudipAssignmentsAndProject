package com.anudip.org.dao;

import java.util.List;
import com.anudip.org.dto.CartDTO;

public interface CartDao {

    boolean addToCart(CartDTO cart);
    List<CartDTO> showCart(String userEmail);
    boolean deleteCartItem(int cartId);
    boolean clearCart(String userEmail);
}
