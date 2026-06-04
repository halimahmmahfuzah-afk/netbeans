package Tugas1;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa;

    public KelasKuliah() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public double hitungRataRata() {
        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public void tampilkanSemua() {
        System.out.println("===== DATA MAHASISWA =====");

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("Nama  : " + m.getNama());
            System.out.println("NPM   : " + m.getNpm());
            System.out.println("Nilai : " + m.getNilai());
            System.out.println("Status: " +
                    (m.lulus() ? "Lulus" : "Tidak Lulus"));
            System.out.println("----------------------");
        }
    }

    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}