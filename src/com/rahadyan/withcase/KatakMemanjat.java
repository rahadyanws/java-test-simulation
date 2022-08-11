package com.rahadyan.withcase;

public class KatakMemanjat {
    public static void main(String[] args) {
        /**
         * Seekor siput berada di dasar sumur sedalam 20 meter. Setiap siang siput ini naik 5 meter,
         * tetapi saat malam akan merosot 4 meter.
         * Berapa hari yang diperlukan siput ini untuk keluar dari sumur?
         */

        Integer dalamSumur = 20;
        Integer hari = 0;
        Integer lajuSiang = 5;
        Integer lajuMalam = -4;
        Integer lajuTotal = 0;
        for (int i = 1; i <= dalamSumur; i++) {
            hari++;
            System.out.print("Hari " + hari + ". ");
            lajuTotal = lajuTotal + (lajuSiang);
            if (lajuTotal == dalamSumur) {
                System.out.println("Setelah siang " + lajuTotal + " meter");
                break;
            }
            lajuTotal = lajuTotal + (lajuMalam);
            System.out.println("Setelah malam " + lajuTotal + " meter");
        }

    }
}
