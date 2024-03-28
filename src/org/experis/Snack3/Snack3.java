package org.experis.Snack3;

public class Snack3 {
    public static void main(String[] args) {
        int[] myNum = {1,2,3,4};
        int total = 0;

        for (int i = 0; i < myNum.length; i++) {
            if (i % 2 != 0){
                System.out.println("index num: " + i + " element: " + myNum[i]);
                total += myNum[i];
            }
        }
        System.out.println(total);
    }
}
