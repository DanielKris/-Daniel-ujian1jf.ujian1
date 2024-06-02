package com.juaracoding.ujianjf;

import java.util.Scanner;

public class Soal4 { // perulangan
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // penggunaan Scanner untuk menginput ke5 nama film oleh user
        String[] judulFilm = new String[5];  // Penggunaan tipe data String digunakan untuk membuat tipe Text atau Tulisan
            System.out.println("Daftar Film Bioskop");
                System.out.print("Masukan Nama Film 1: ");
                judulFilm[0] = sc.nextLine();
                System.out.print("Masukan Nama Film 2: ");
                judulFilm[1] = sc.nextLine();
                System.out.print("Masukan Nama Film 3: ");
                judulFilm[2] = sc.nextLine();
                System.out.print("Masukan Nama Film 4: ");
                judulFilm[3] = sc.nextLine();
                System.out.print("Masukan Nama Film 5: ");
                judulFilm[4] = sc.nextLine();

        System.out.println("Film yang ingin ditonton: ");
            for (int i = 0; i < judulFilm.length; i++) {
                System.out.println(1+i +". " +judulFilm[i]); // penggunaan 1+i = untuk menanmpilkan nomor urut inputan user

        }
    }
}


