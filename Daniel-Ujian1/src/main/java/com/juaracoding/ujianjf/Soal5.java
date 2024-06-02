package com.juaracoding.ujianjf;

import java.util.Scanner;

public class Soal5 { // Arrai
    public static void main(String[] args) {
        int[] price = new int[5];
        price[0] = 50000;
        price[1] = 60000;
        price[2] = 70000;
        price[3] = 80000;
        price[4] = 90000;
        System.out.println("Harga tiket film 1 :" +price[0]);
        System.out.println("Harga tiket film 2: " +price[1]);
        System.out.println("Harga tiket film 3: " +price[2]);
        System.out.println("Harga tiket film 4: " +price[3]);
        System.out.println("Harga tiket film 5: " +price[4]);

        int jumlah = price[0] + price[1] + price[2] + price[3] + price[4] ;
        System.out.println("Total harga tiket: "+jumlah);
    }
}



