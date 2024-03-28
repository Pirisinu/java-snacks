package org.experis.bonus.Snack5;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String inputString = scan.nextLine();

        int countAlphabetic = 0;
        int countNumeric = 0;
        int countNonAlphanumeric  = 0;
        for (int i = 0; i < inputString.length(); i++) {

            char currentChar = inputString.charAt(i);

            if (Character.isLetter(currentChar)) {
                countAlphabetic++;
            } else if (Character.isDigit(currentChar)) {
                countNumeric++;
            } else {
                countNonAlphanumeric++;
            }
        }
    }
}
