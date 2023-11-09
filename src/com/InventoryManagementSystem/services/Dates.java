package com.InventoryManagementSystem.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {


    public static Date parseDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        Date parsed;
        try {
            parsed = format.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return parsed;
    }

}
