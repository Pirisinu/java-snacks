package org.experis.Snack1;
import java.util.Scanner;
public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero compreso tra 10 e 20: ");
        byte selectedNum = scanner.nextByte();

        while (selectedNum < 10 || selectedNum > 20){
            System.out.println("Seleziona un altro numero");
            selectedNum = scanner.nextByte();
        };
        System.out.println("numero selezonato: " + selectedNum);

    }
}
