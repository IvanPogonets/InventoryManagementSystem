package com.InventoryManagementSystem;

import com.InventoryManagementSystem.Interfaces.Perishable;
import com.InventoryManagementSystem.Interfaces.Sellable;
import com.InventoryManagementSystem.Interfaces.Breakable;
import com.InventoryManagementSystem.Interfaces.Item;

public abstract class AbstractItem implements Item,
        Perishable, Sellable {
    public void checkBreakable() {

    }
}
