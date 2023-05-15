package org.cdl.supermarket.stockdetails;

import org.cdl.supermarket.ds.Item;

import java.util.HashMap;
import java.util.Map;

/**
 * This class can be treated as a Stock Keeping Units and can be changed for adding, removing
 * or updating any item. The price of the item can also be updated for the existing items.
 */
public class SKU {

    /**
     * @return A map of item name and an object of item that has name and price
     */
    public static Map<Character, Item> getCharacterItemMap() {

        Map<Character, Item> itemMap = new HashMap<>();

        itemMap.put('A', new Item('A', 50));
        itemMap.put('B', new Item('B', 30));
        itemMap.put('C', new Item('C', 20));
        itemMap.put('D', new Item('D', 15));

        return itemMap;
    }
}
