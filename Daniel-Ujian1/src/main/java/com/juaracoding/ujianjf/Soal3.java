package com.juaracoding.ujianjf;

import java.util.Date;
import java.util.Scanner;

public class Soal3 { // Percabangan
    public static void main(String[] args) {
        int tiket = 6;
        int hargaWeekDay = 35000;
        int hargaWeekEnd = 45000;

        int hariBiasa = hargaWeekDay * tiket;
        int hariLibur = hargaWeekEnd * tiket;

        int hargaDiskon = hariBiasa * 10 / 100;
        int hargaDisLibur = hariLibur * 10 / 100;

        int totalHargaBiasa = hariBiasa - hargaDiskon;
        int totalHargaLibur = hariLibur - hargaDisLibur;

        System.out.println("Jumlah Tiket: " + tiket);
        if (tiket < 5) {
            System.out.println("Total Harga (dengan diskon): " +hariBiasa);
        } else {
            if (tiket >= 5) {
                System.out.println("Total Harga (dengan diskon): " +totalHargaBiasa);
            }
        }
    }
}





