package com.InventoryManagementSystem.items;

import com.InventoryManagementSystem.Interfaces.Breakable;

public class BreakableItem extends InventoryItem implements Breakable {
    boolean broken = false;



    @Override
    public void setBroken() {
        this.broken = true;
    }
}
