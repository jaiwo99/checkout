package com.jaiwo99.playground.checkout.shoppingcart;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author jaiwo99
 */
public class SimpleShoppingCartTest {


    private ShoppingCart shoppingCart;

    @Before
    public void setUp() {
        shoppingCart = new SimpleShoppingCart();
    }

    @Test
    public void add_should_be_able_to_add_same_item_more_times() {
        shoppingCart.add('A');
        shoppingCart.add('A');
        shoppingCart.add('A');
        shoppingCart.add('A');
        shoppingCart.add('A');

        assertTrue(shoppingCart.getItems().get('A') == 5);
    }

    @Test
    public void add_should_be_able_to_add_different_items() {
        shoppingCart.add('A');
        shoppingCart.add('B');
        shoppingCart.add('C');

        assertTrue(shoppingCart.getItems().size() == 3);
        assertTrue(shoppingCart.getItems().get('A') == 1);
        assertTrue(shoppingCart.getItems().get('B') == 1);
        assertTrue(shoppingCart.getItems().get('C') == 1);
    }

    @Test
    public void getItems_should_return_all_different_items() {
        shoppingCart.add('A');
        shoppingCart.add('B');
        shoppingCart.add('C');

        assertTrue(shoppingCart.getItems().size() == 3);
    }

    @Test
    public void getItems_should_return_all_items() {
        shoppingCart.add('A');
        shoppingCart.add('A');
        shoppingCart.add('A');
        shoppingCart.add('A');
        shoppingCart.add('A');

        assertTrue(shoppingCart.getItems().size() == 1);
    }
}