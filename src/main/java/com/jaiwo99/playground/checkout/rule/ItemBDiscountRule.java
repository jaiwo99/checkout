package com.jaiwo99.playground.checkout.rule;

import com.jaiwo99.playground.checkout.shoppingcart.ShoppingCart;

/**
 * @author jaiwo99
 */
public class ItemBDiscountRule implements DiscountRule {
    @Override
    public int apply(ShoppingCart shoppingCart) {
        if (shoppingCart.getItems().containsKey('B')) {
            return Math.floorDiv(shoppingCart.getItems().get('B'), 2) * -20;
        }
        return 0;
    }
}
