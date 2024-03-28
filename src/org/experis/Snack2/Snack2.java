package org.experis.Snack2;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] nomi = {"Mario", "Luigi", "Giovanni", "Marco", "Paolo", "Giuseppe", "Francesco", "Luca", "Andrea", "Alessandro", "Antonio", "Roberto", "Davide", "Simone", "Stefano"};
        String[] cognomi = {"Rossi", "Bianchi", "Ferrari", "Esposito", "Russo", "Romano", "Gallo", "Costa", "Fontana", "Conti", "Barbieri", "Greco", "Marino", "Galli", "Moretti"};
        int totalFakeName = nomi.length * cognomi.length;
        String[] fakeList = new String[totalFakeName];

        int fakeListIndex = 0;
        for (int i = 0; i < nomi.length; i++) {
            for (int j = 0; j < cognomi.length; j++) {
                fakeList[fakeListIndex] = nomi[i] + " " + cognomi[j];
                fakeListIndex++;
            }
        }
        System.out.println(Arrays.toString(fakeList));





    }
}
