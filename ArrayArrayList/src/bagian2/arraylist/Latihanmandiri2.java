package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri2 {
    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(12);
        angka.add(45);
        angka.add(8);
        angka.add(27);
        angka.add(33);

        int terbesar = angka.get(0);

        for (int nilai : angka) {
            if (nilai > terbesar) {
                terbesar = nilai;
            }
        }

        System.out.println("Nilai terbesar = " + terbesar);
    }
}