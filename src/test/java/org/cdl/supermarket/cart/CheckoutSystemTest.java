package org.cdl.supermarket.cart;

import org.cdl.supermarket.ds.Item;
import org.cdl.supermarket.ds.SpecialPrices;
import org.cdl.supermarket.scanutility.Receipt;
import org.cdl.supermarket.stockdetails.PricingRules;
import org.cdl.supermarket.stockdetails.SKU;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test cases for the checkout system
 */
class CheckoutSystemTest {

    Map<Character, Item> characterItemMap = SKU.getCharacterItemMap();
    Map<Character, SpecialPrices> specialPricesMap = PricingRules.getCharacterSpecialPricesMap();
    Receipt receipt = new Receipt(characterItemMap, specialPricesMap);

    /**
     * Tests the running total and final total when a single item is scanned.
     */

    @Test
    public void testOneScanForRunningTotalAndFinalTotal() {
        receipt.scan('A');
        assertEquals(0.5, receipt.getRunningTotal());
        assertEquals(0.5, receipt.getFinalTotal());

    }

    /**
     * Tests the running total and final total when multiple items are scanned.
     */
    @Test
    public void testMultipleScanForRunningTotalAndFinalTotal() {
        receipt.scan('A');
        receipt.scan('B');
        receipt.scan('C');

        assertEquals(1.0, receipt.getRunningTotal());
        assertEquals(1.0, receipt.getFinalTotal());

    }

    /**
     * Tests the running total and final total when multiple items are scanned repeatedly.
     */
    @Test
    public void testRepeatedMultipleScanForRunningTotalAndFinalTotal() {
        receipt.scan('A');
        receipt.scan('A');
        receipt.scan('A');
        receipt.scan('B');
        receipt.scan('B');
        receipt.scan('C');

        assertEquals(1.95, receipt.getRunningTotal());
        assertEquals(1.95, receipt.getFinalTotal());

    }

    /**
     * Tests the running total and final total when multiple items are scanned repeatedly in any order.
     */
    @Test
    public void testRepeatedInAnyOrderMultipleScanForRunningTotalAndFinalTotal() {
        receipt.scan('A');
        receipt.scan('B');
        receipt.scan('A');
        receipt.scan('B');
        receipt.scan('A');
        receipt.scan('C');

        assertEquals(1.95, receipt.getRunningTotal());
        assertEquals(1.95, receipt.getFinalTotal());

    }
}