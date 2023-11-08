package com.InventoryManagementSystem.items;

import com.InventoryManagementSystem.Interfaces.Breakable;
import com.InventoryManagementSystem.Storage;

public class BreakableItem extends InventoryItem implements Breakable {
    boolean broken;
    public void setBroken(long id, int quantity) {
        InventoryItem item = Storage.getItemByID(id);
        Storage.getItemByID(id).decreaseQuantity(quantity);
        item.setQuantity(quantity);
        item.setUnsellable();
        item.setBroken();
        Storage.storage.put(item.getId(), item);
    }

    }
}
