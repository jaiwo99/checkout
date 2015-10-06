package com.jaiwo99.playground.checkout.shoppingcart;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jaiwo99
 */
public class SimpleShoppingCart implements ShoppingCart {

    private final Map<Character, Integer> map = new HashMap<>();

    public void add(Character item) {
        if (map.containsKey(item)) {
            map.put(item, map.get(item)+1);
        } else {
            map.put(item, 1);
        }
    }

    /**
     * Return an immutable map
     */
    public Map<Character, Integer> getItems() {
        return Collections.unmodifiableMap(map);
    }
}
