package org.cdl.supermarket.cart;

import org.cdl.supermarket.ds.Item;
import org.cdl.supermarket.ds.SpecialPrices;
import org.cdl.supermarket.scanutility.Receipt;
import org.cdl.supermarket.stockdetails.PricingRules;
import org.cdl.supermarket.stockdetails.SKU;

import java.util.Map;
import java.util.Scanner;

/**
 * Main Class that handles the Checkout System for a pre-defined stock and special prices
 */
public class CheckoutSystem {

    private static Map<Character, Item> characterItemMap;
    private static Map<Character, SpecialPrices> specialPricesMap;
    private static double receiptTotal = 0.0;

    public static void main(String[] args) throws InterruptedException {

        characterItemMap = SKU.getCharacterItemMap();
        specialPricesMap = PricingRules.getCharacterSpecialPricesMap();

        Receipt receipt = new Receipt(characterItemMap, specialPricesMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Scan items, enter 'q' to quit or finish scanning: ");
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            receipt.scan(input.charAt(0));

        }

        receiptTotal = receipt.getFinalTotal();
        if (receiptTotal > 0.0){
            System.out.println("Total: £" + receiptTotal);
            System.out.println("Please proceed to pay....");
            Thread.sleep(1000);
            System.out.println("\nThank you for shopping");
        } else {
            System.out.println("\nThank you for your time with us");
        }
        System.out.println("See you next time! Have a good day ahead");

    }

}

