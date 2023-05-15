package org.cdl.supermarket.scanutility;

import org.cdl.supermarket.ds.Item;
import org.cdl.supermarket.ds.SpecialPrices;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is a scan utility for generating an on-screen receipt for each item that will be scanned.
 * This class shall also return the running total and final total of the purchase
 */
public class Receipt {

    private final Map<Character, Item> itemMap;
    private final Map<Character, SpecialPrices> specials;
    private Map<Character, Integer> itemCounts = new HashMap<>();
    private double runningTotal = 0;

    public Receipt(Map<Character, Item> itemMap, Map<Character, SpecialPrices> specials) {
        this.itemMap = itemMap;
        this.specials = specials;
    }

    /**
     * Scans the item and updates the price if there is any special price involved and throws error
     * if the item is not stock
     *
     * @param itemName Item Name that has been scanned
     */
    public void scan(char itemName) {
        itemCounts.put(itemName, itemCounts.getOrDefault(itemName, 0) + 1);
        try {
            runningTotal += itemMap.get(itemName).getPrice();

            if (specials.containsKey(itemName)) {
                SpecialPrices specialPrices = specials.get(itemName);
                int itemCount = itemCounts.get(itemName);
                int quantity = specialPrices.getQuantity();
                if (itemCount % quantity == 0) {
                    int offerPrice = specialPrices.getPrice();
                    runningTotal -= itemMap.get(itemName).getPrice() * quantity - offerPrice;
                }
            }
            System.out.println("Running total: £" + runningTotal / 100);
            System.out.println("Scan next item or press 'q' to finish shopping");
        } catch (Exception e) {
            System.err.println("Item not in stock, contact nearby sales assistant");
            System.err.println("Scan next item or press 'q' to quit: ");
        }

    }

    /**
     * @return final total after every new scan
     */
    public double getFinalTotal() {
        return runningTotal / 100;
    }

    /**
     * @return running total after the entire purchase
     */
    public double getRunningTotal() {
        return runningTotal / 100;
    }
}
