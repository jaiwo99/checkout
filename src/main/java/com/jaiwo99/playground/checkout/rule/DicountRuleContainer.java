package com.jaiwo99.playground.checkout.rule;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jaiwo99
 */
public class DicountRuleContainer {

    private static final List<DiscountRule> ruleList = new ArrayList<>();

    // Simulated behavior,
    static {
        ruleList.add(new ItemADiscountRule());
        ruleList.add(new ItemBDiscountRule());
    }

    public static List<DiscountRule> getDiscountRules() {
        return ruleList;
    }
}
