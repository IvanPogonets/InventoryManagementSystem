package com.InventoryManagementSystem.items;

public class InventoryItem extends AbstractItem {
    static long idCount = 0;
    long id;
    Categories category;
    String name;
    boolean sellable = true;
    double quantity;
    String unitsOfMeasurement;
    double price;
    String description;


    public void setItem(String... data) {
        idCount += 1;
        this.id = idCount;
        this.category = Categories.valueOf(data[0]);
        this.name = data[1];
        this.quantity = Double.parseDouble(data[2]);
        this.unitsOfMeasurement = data[3];
        this.price = Double.parseDouble(data[4]);
        this.description = data[5];
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + sellable + "," + quantity
                + "," + unitsOfMeasurement + "," + price + "," + description;
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

    public void setCategory(Categories category) {
        this.category = category;
    }
}
