package com.anudip.org.controller;

import java.util.List;
import com.anudip.org.dto.CartDTO;
import com.anudip.org.service.CartService;
import com.anudip.org.service.impl.CartServiceImpl;

public class CartController {

    private CartService cartService = new CartServiceImpl();

    public boolean addToCart(CartDTO cart) {
        return cartService.addToCart(cart);
    }

    public List<CartDTO> showCart(String userEmail) {
        return cartService.showCart(userEmail);
    }

    public boolean deleteCartItem(int cartId) {
        return cartService.deleteCartItem(cartId);
    }

    public boolean clearCart(String userEmail) {
        return cartService.clearCart(userEmail);
    }
}
