package com.InventoryManagementSystem.items;

public class InventoryItem extends AbstractItem{
    static long idCount = 0;
    long id;
    String name;
    boolean sellable;
    double quantity;
    String unitsOfMeasurement;
    double price;
    String description;


    public double getPrice() {
        return price;
    }
    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + "," + name + "," +sellable + "," + quantity
                + "," + unitsOfMeasurement + "," + price + "," + description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void decreaseQuantity(int quantity) {
    }

    public void setUnsellable() {
    }

    public void setBroken() {
    }

    @Override
    public String getItemDetails() {
        return description;
    }

    @Override
    public void displayDescription() {

    }
}
