package com.InventoryManagementSystem.Interfaces;

public interface Perishable {
    void setExpirationDate();
    void viewExpirationDate();
    void ifExpired();
}
