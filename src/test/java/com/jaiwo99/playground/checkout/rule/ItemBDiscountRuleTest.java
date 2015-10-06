package com.jaiwo99.playground.checkout.rule;

import com.jaiwo99.playground.checkout.shoppingcart.ShoppingCart;
import com.jaiwo99.playground.checkout.shoppingcart.SimpleShoppingCart;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jaiwo99
 */
public class ItemBDiscountRuleTest {

    private ItemBDiscountRule rule;
    private ShoppingCart shoppingCart;

    @Before
    public void setUp() {
        rule = new ItemBDiscountRule();
        shoppingCart = new SimpleShoppingCart();
    }

    @Test
    public void apply_should_return_no_discount_if_A_item_appears_1_times() {
        shoppingCart.add('B');

        assertEquals(rule.apply(shoppingCart), 0);
    }

    @Test
    public void apply_should_return_discount_if_A_item_appears_2_times() {
        shoppingCart.add('B');
        shoppingCart.add('B');

        assertEquals(rule.apply(shoppingCart), -20);
    }

    @Test
    public void apply_should_return_discount_if_A_item_appears_3_times() {
        shoppingCart.add('B');
        shoppingCart.add('B');

        shoppingCart.add('B');

        assertEquals(rule.apply(shoppingCart), -20);
    }

    @Test
    public void apply_should_return_discount_if_A_item_appears_9_times() {
        shoppingCart.add('B');
        shoppingCart.add('B');

        shoppingCart.add('B');
        shoppingCart.add('B');

        shoppingCart.add('B');
        shoppingCart.add('B');

        shoppingCart.add('B');
        shoppingCart.add('B');

        shoppingCart.add('B');

        assertEquals(rule.apply(shoppingCart), -80);
    }

}