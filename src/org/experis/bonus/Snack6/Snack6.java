package org.experis.bonus.Snack6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Snack6 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatFull = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
        String formattedDateFull = formatFull.format(date);
        String formattedDateTime = formatTime.format(date);
        System.out.println("Ora formattata: " + formattedDateTime);
        System.out.println("Data e ora formattate: " + formattedDateFull);
    }
}
