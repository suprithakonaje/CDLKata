package org.cdl.supermarket.ds;

/**
 * Data Structure for Special Prices
 */
public class SpecialPrices {

    private int quantity;
    private int price;

    public SpecialPrices(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SpecialPrices{" +
                "quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

