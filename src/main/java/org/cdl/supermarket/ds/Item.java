package org.cdl.supermarket.ds;

/**
 * Data Structure for Item
 */
public class Item {
    private char name;
    private double price;
    private int quantity;

    public Item(char name, double price) {
        this.name = name;
        this.price = price;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public void clearQuantity() {
        quantity = 0;
    }
}