package com.jaiwo99.playground.checkout;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides product information
 *
 * @author jaiwo99
 */
public class Warehouse {

    private static final Map<Character, Integer> priceMap = new HashMap<>();

    //simulate behavior, data can be retrieve from somewhere else, i.e. from DB.
    static {
        priceMap.put('A', 40);
        priceMap.put('B', 50);
        priceMap.put('C', 25);
        priceMap.put('D', 20);
    }

    public static int getPriceBySku(Character c) {
        return priceMap.get(c);
    }
}
