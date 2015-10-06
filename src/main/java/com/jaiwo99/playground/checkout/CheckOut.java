package com.jaiwo99.playground.checkout;

import com.jaiwo99.playground.checkout.rule.DiscountRule;
import com.jaiwo99.playground.checkout.shoppingcart.ShoppingCart;
import com.jaiwo99.playground.checkout.shoppingcart.SimpleShoppingCart;

import java.util.List;

/**
 * @author jaiwo99
 */
public class CheckOut {

    private final List<DiscountRule> rules;
    private final ShoppingCart shoppingCart;

    public CheckOut(List<DiscountRule> rules) {
        this.rules = rules;
        this.shoppingCart = new SimpleShoppingCart();
    }


    public void scan(String item) {
        assert item.length() == 1;
        shoppingCart.add(item.toCharArray()[0]);
    }

    public int total() {
        // calculate the original price
        int sum = shoppingCart.getItems().entrySet().parallelStream().map(entry -> Warehouse.getPriceBySku(entry.getKey())*entry.getValue()).reduce((integer, integer2) -> integer+integer2).orElse(0);

        // calculate rules one by one
        for (DiscountRule rule : rules) {
            sum += rule.apply(shoppingCart);
        }

        return sum;
    }
}
