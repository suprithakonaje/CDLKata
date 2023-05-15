package org.cdl.supermarket.stockdetails;

import org.cdl.supermarket.ds.SpecialPrices;

import java.util.HashMap;
import java.util.Map;

/**
 * This class can be used to pass a set of pre-defined pricing rules
 * and can be updated for checkout transaction
 */
public class PricingRules {

    /**
     * @return A map of item name and special price based on quantity for that particular item
     */
    public static Map<Character, SpecialPrices> getCharacterSpecialPricesMap() {

        Map<Character, SpecialPrices> specials = new HashMap<>();

        specials.put('A', new SpecialPrices(3, 130));
        specials.put('B', new SpecialPrices(2, 45));

        return specials;

    }
}
