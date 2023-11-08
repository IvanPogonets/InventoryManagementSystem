package com.InventoryManagementSystem;

import com.InventoryManagementSystem.items.InventoryItem;

import java.util.HashMap;

//contains list of items and quantity
public class Storage {
    public static HashMap<Long, InventoryItem> storage;


    public void addItem(InventoryItem item) {
        storage.put(item.getId(), item);
    }


    public static InventoryItem getItemByID(long id) {
        return storage.get(id);
    }
}
