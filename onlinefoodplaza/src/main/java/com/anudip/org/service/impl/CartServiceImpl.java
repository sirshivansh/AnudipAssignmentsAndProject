package com.anudip.org.service.impl;

import java.util.List;
import com.anudip.org.dao.CartDao;
import com.anudip.org.dao.impl.CartDaoImpl;
import com.anudip.org.dto.CartDTO;
import com.anudip.org.service.CartService;

public class CartServiceImpl implements CartService {

    private CartDao cartDao = new CartDaoImpl();

    @Override
    public boolean addToCart(CartDTO cart) {
        return cartDao.addToCart(cart);
    }

    @Override
    public List<CartDTO> showCart(String userEmail) {
        return cartDao.showCart(userEmail);
    }

    @Override
    public boolean deleteCartItem(int cartId) {
        return cartDao.deleteCartItem(cartId);
    }

    @Override
    public boolean clearCart(String userEmail) {
        return cartDao.clearCart(userEmail);
    }
}
