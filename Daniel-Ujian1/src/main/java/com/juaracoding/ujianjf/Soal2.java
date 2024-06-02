package com.juaracoding.ujianjf;

import java.util.Scanner;

public class Soal2 { // String Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // penggunaan Scanner untuk menginput nama film oleh user
            System.out.print("Masukan Nama Film: ");
            String judulFilm = sc.nextLine();
            System.out.println("Nama film dalam huruf besar: " + judulFilm.toUpperCase());
            // toUpperCase di gunakan untuk penggantian text huruf kecil ke huruf Besar

    }
}
