package com.InventoryManagementSystem;

public enum Categories {
    ELECTRONICS("Electronics"),
    GROCERY("Grocery"),
    FRAGILE("Fragile"),
    HOUSEHOLD("Household");
private final String title;

    Categories(String title) {
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}
