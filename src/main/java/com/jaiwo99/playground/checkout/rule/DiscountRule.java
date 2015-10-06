package com.jaiwo99.playground.checkout.rule;

import com.jaiwo99.playground.checkout.shoppingcart.ShoppingCart;

/**
 * @author jaiwo99
 */
public interface DiscountRule {

    int apply(ShoppingCart shoppingCart);
}
