package com.jaiwo99.playground.checkout.rule;

import com.jaiwo99.playground.checkout.shoppingcart.ShoppingCart;

/**
 * @author jaiwo99
 */
public class ItemADiscountRule implements DiscountRule {
    @Override
    public int apply(ShoppingCart shoppingCart) {
        if (shoppingCart.getItems().containsKey('A')) {
            return Math.floorDiv(shoppingCart.getItems().get('A'), 3) * -20;
        }
        return 0;
    }
}
