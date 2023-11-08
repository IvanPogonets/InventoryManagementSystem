package com.InventoryManagementSystem.items;

public enum Categories {
    ELECTRONICS("Electronics"),
    GROCERY("Grocery"),
    HOUSEHOLD("Household");
private final String title;

    Categories(String title) {
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}
