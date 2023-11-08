package com.InventoryManagementSystem;

import com.InventoryManagementSystem.items.Categories;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        String electronics = Categories.ELECTRONICS.getTitle();
        System.out.println(electronics);
    }
}
