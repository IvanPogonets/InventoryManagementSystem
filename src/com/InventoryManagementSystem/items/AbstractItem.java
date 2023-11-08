package com.InventoryManagementSystem.items;

import com.InventoryManagementSystem.Interfaces.*;

public abstract class AbstractItem implements Item, Sellable, Categorizable {

    public void setPrice(double price) {

    }

    public  void showPrice(){

    }

    public void setCategory() {

    }

    public String getCategory() {
return null;
    }
    public abstract String toString();
}

