package Tugas1;

// Nama : Halimah Mahfuzah
// NPM  : 2410010607

public class MainTugas {

    public static void main(String[] args) {

        // Array String mata kuliah (minimal 3)
        String[] mataKuliah = {
                "Pemrograman Berorientasi Objek",
                "Struktur Data",
                "Basis Data"
        };

        System.out.println("===== DAFTAR MATA KULIAH =====");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Minimal 5 mahasiswa
        kelas.tambahMahasiswa(
                new Mahasiswa("Andi", "241001001", 85));

        kelas.tambahMahasiswa(
                new Mahasiswa("Budi", "241001002", 70));

        kelas.tambahMahasiswa(
                new Mahasiswa("Citra", "241001003", 55));

        kelas.tambahMahasiswa(
                new Mahasiswa("Dina", "241001004", 90));

        kelas.tambahMahasiswa(
                new Mahasiswa("Eka", "241001005", 45));

        System.out.println("Jumlah Mahasiswa Awal : "
                + kelas.jumlahMahasiswa());

        System.out.println();

        kelas.tampilkanSemua();

        System.out.println("Rata-rata Nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah Lulus : "
                + kelas.jumlahLulus());

        System.out.println();

        // Menambah 1 mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Fajar", "241001006", 80));

        System.out.println("===== SETELAH MENAMBAH DATA =====");
        System.out.println("Jumlah Mahasiswa Terbaru : "
                + kelas.jumlahMahasiswa());

        System.out.println();

        kelas.tampilkanSemua();

        System.out.println("Rata-rata Nilai Terbaru : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah Lulus Terbaru : "
                + kelas.jumlahLulus());
    }
}