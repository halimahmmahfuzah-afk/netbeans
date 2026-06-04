package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {

    private ArrayList<Buku> koleksi = new ArrayList<>();

    // Tambah buku
    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    // Tampilkan koleksi
    public void tampilkanKoleksi() {

        System.out.println("=== Koleksi Perpustakaan ===");

        for (int i = 0; i < koleksi.size(); i++) {

            Buku b = koleksi.get(i);

            System.out.println((i + 1) + ". " + b.info());
        }
    }

    // Pinjam buku
    public void pinjamBuku(String judul) {

        for (Buku b : koleksi) {

            if (b.getJudul().equalsIgnoreCase(judul)) {

                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }

                return;
            }
        }

        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // LATIHAN 1 — Kembalikan Buku
    public void kembalikanBuku(String judul) {

        for (Buku b : koleksi) {

            if (b.getJudul().equalsIgnoreCase(judul)) {

                if (!b.isDipinjam()) {
                    System.out.println(judul + " memang tidak sedang dipinjam.");
                } else {
                    b.setDipinjam(false);
                    System.out.println(judul + " berhasil dikembalikan.");
                }

                return;
            }
        }

        System.out.println("Buku tidak ditemukan.");
    }

    // Hitung buku tersedia
    public int jumlahTersedia() {

        int jumlah = 0;

        for (Buku b : koleksi) {

            if (!b.isDipinjam()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    // LATIHAN 3 — Cari Penulis
    public void cariPenulis(String penulis) {

        boolean ditemukan = false;

        System.out.println("\nBuku karya " + penulis + ":");

        for (Buku b : koleksi) {

            if (b.getPenulis().equalsIgnoreCase(penulis)) {

                System.out.println("- " + b.info());

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada buku ditemukan.");
        }
    }
}