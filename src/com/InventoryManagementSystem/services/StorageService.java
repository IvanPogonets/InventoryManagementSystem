package com.InventoryManagementSystem.services;

import com.InventoryManagementSystem.Storage;
import com.InventoryManagementSystem.items.BreakableItem;
import com.InventoryManagementSystem.items.Categories;
import com.InventoryManagementSystem.items.InventoryItem;
import com.InventoryManagementSystem.items.PerishableItem;

import java.util.Scanner;

public class StorageService {
    public void addNewItemToStorage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of item");
        String type = scanner.nextLine();
        System.out.println("Enter properties and quantity");
        String itemString = scanner.nextLine();
        switch (type) {
            case "breakable":
                InventoryItem breakableItem = new BreakableItem();
                breakableItem.setItem(itemString);
                Storage.addItem(breakableItem);
                break;
            case "perishable":
                InventoryItem perishableItem = new PerishableItem();
                perishableItem.setItem(itemString);
                Storage.addItem(perishableItem);
                break;
            case "other":
                InventoryItem item = new InventoryItem();
                item.setItem(itemString);
                Storage.addItem(item);
                break;
        }


    }

    public void changeQuantity(InventoryItem item, double quantity) {

    }

    public void decreaseQuantity(InventoryItem item, double quantity) {

    }

    public void setBroken(long id, int quantity) {
        InventoryItem item = new BreakableItem();
        item = Storage.getItemByID(id);
        Storage.getItemByID(id).decreaseQuantity(quantity);
        item.setQuantity(quantity);
        item.setUnsellable();
        item.setBroken();
        Storage.storage.put(item.getId(), item);
    }

}

