package com.InventoryManagementSystem.Interfaces;

import java.util.Date;

public interface Perishable {

    void setExpirationDate(Date expirationDate);

    String getExpirationDate();
    void ifExpired();
}
