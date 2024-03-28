package org.experis.Snack4;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Seleziona la parola da dover per vedere se è palindroma: ");
        String selectedWord = scan.nextLine();

        System.out.println(selectedWord);
    }
}
