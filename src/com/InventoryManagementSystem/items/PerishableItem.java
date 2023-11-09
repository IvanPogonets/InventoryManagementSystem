package com.InventoryManagementSystem.items;

import com.InventoryManagementSystem.Interfaces.Perishable;
import com.InventoryManagementSystem.services.Dates;

import java.util.Date;

public class PerishableItem extends InventoryItem implements Perishable {
    Date expirationDate;


    public void setItem(String... data) {
        super.setItem();
        this.expirationDate = Dates.parseDate(data[5]);
    }

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
