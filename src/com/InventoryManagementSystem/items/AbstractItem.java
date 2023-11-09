package com.InventoryManagementSystem.items;

import com.InventoryManagementSystem.Interfaces.*;

public abstract class AbstractItem implements Item, Sellable, Categorizable {


    public String getCategory() {
return null;
    }
    public abstract String toString();
}

