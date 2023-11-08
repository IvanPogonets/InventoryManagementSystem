package com.InventoryManagementSystem.items;

import com.InventoryManagementSystem.Interfaces.Perishable;

import java.util.Date;

public class PerishableItem extends InventoryItem implements Perishable {
    Date expirationDate;
    @Override
    public void setExpirationDate(Date expirationDate) {
    }

    @Override
    public String getExpirationDate() {
        return null;
    }

    @Override
    public void ifExpired() {

    }

}
