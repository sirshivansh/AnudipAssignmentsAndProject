package com.anudip.org.service;

import java.util.List;
import com.anudip.org.dto.CartDTO;

public interface CartService {

    boolean addToCart(CartDTO cart);
    List<CartDTO> showCart(String userEmail);
    boolean deleteCartItem(int cartId);
    boolean clearCart(String userEmail);
}
