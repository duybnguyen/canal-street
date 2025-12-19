package org.yearup.data.mysql;

import org.springframework.stereotype.Component;
import org.yearup.data.ShoppingCartDao;
import org.yearup.models.Product;
import org.yearup.models.ShoppingCart;

@Component
public class MySqlShoppingCartDao implements ShoppingCartDao
{
    @Override
    public ShoppingCart getByUserId(int userId) {
        return new ShoppingCart();
    }

    @Override
    public void addToCart(int userId, int productId) {

    }

    @Override
    public void updateQuantity(int userId, int productId, int quantity) {

    }

    @Override
    public void clearCart(int userId) {

    }

}
