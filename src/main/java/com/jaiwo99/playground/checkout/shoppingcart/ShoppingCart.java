package com.jaiwo99.playground.checkout.shoppingcart;

import java.util.Map;

/**
 * @author jaiwo99
 */
public interface ShoppingCart {

    void add(Character c);
    Map<Character, Integer> getItems();
}
