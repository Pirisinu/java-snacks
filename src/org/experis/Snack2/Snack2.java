package org.experis.Snack2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        String[] nomi = {"Mario", "Luigi", "Giovanni", "Marco", "Paolo", "Giuseppe", "Francesco", "Luca", "Andrea", "Alessandro", "Antonio", "Roberto", "Davide", "Simone", "Stefano"};
        String[] cognomi = {"Rossi", "Bianchi", "Ferrari", "Esposito", "Russo", "Romano", "Gallo", "Costa", "Fontana", "Conti", "Barbieri", "Greco", "Marino", "Galli", "Moretti"};

        // Genera nomi e cognomi in base alla quantita di nomi e cognomi disponibili.
//        int totalFakeName = nomi.length * cognomi.length;
//        String[] fakeList = new String[totalFakeName];
//
//        int fakeListIndex = 0;
//        for (int i = 0; i < nomi.length; i++) {
//            for (int j = 0; j < cognomi.length; j++) {
//                fakeList[fakeListIndex] = nomi[i] + " " + cognomi[j];
//                fakeListIndex++;
//            }
//        }
//        System.out.println(Arrays.toString(fakeList));


        Random random = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.println("Numero massimo selezionabile= " + nomi.length);
        System.out.println("Scegli quanti nomi di invitati casuali vuoi scegliere: ");

        int numNameToGenerate = scan.nextInt();

        String[] fakeName = new String[numNameToGenerate];

        for (int i = 0; i < numNameToGenerate; i++) {
            int iRandomName = random.nextInt(nomi.length);
            int iRandomSurame = random.nextInt(nomi.length);
            fakeName[i] = nomi[iRandomName] + " " + cognomi[iRandomSurame];
        }
        System.out.println(Arrays.toString(fakeName));



    }
}
