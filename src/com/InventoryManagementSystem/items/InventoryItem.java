package com.InventoryManagementSystem.items;

public class InventoryItem extends AbstractItem {
    static long idCount = 0;
    long id;
    String name;
    boolean sellable = true;
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
        return id + "," + name + "," + sellable + "," + quantity
                + "," + unitsOfMeasurement + "," + price + "," + description;
    }

    public void setNewItem(String... data) {
        idCount += 1;
        this.id = idCount;
        this.name = data[0];
        this.quantity = Double.parseDouble(data[1]);
        this.unitsOfMeasurement = data[2];
        this.price = Double.parseDouble(data[3]);
        this.description = data[4];
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void decreaseQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public void setUnsellable() {
        this.sellable = false;
    }

    @Override
    public String getItemDetails() {
        return name + ", " + quantity + "," + unitsOfMeasurement +
                "," + price + "," + description;
    }
}
