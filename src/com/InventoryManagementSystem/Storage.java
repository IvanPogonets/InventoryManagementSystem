package com.InventoryManagementSystem;
import com.InventoryManagementSystem.items.InventoryItem;

import java.util.ArrayList;
import java.util.HashMap;

//contains list of items and quantity
public class Storage {
    public static HashMap<Long, InventoryItem> storage;
    public static HashMap<Long, InventoryItem> storageOfBrokenItems;


    public static void addItem(InventoryItem item) {
        storage.put(item.getId(), item);
    }

    public static InventoryItem getItemByID(long id) {
        return storage.get(id);
    }
}
