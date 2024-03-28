package org.experis.Snack4;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Seleziona la parola da dover per vedere se è palindroma: ");
        String selectedWord = scan.nextLine();

        boolean isPalindromo = false;
        char[] myChar = selectedWord.toCharArray();

        // controllo che la prima lettera sia diversa dall'ultima e incremento per la prima lettera e decremento per l'ultima
        int j = selectedWord.length() - 1;
        for (int i = 0; i < selectedWord.length(); i++) {
            if (myChar[i] != myChar[j]) {
                isPalindromo = false;
                break;
            } else {
                j--;
                isPalindromo = true;
            }
        }

        String message = (isPalindromo) ? "La stringa è palindroma." : "La stringa non è palindorma.";
        System.out.println(isPalindromo);

    }
}
