package bagian3.perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {

        Perpustakaan p = new Perpustakaan();

        // Tambah buku
        p.tambahBuku(new Buku(
                "Laskar Pelangi",
                "Andrea Hirata",
                2005));

        p.tambahBuku(new Buku(
                "Bumi",
                "Tere Liye",
                2014));

        p.tambahBuku(new Buku(
                "Pulang",
                "Tere Liye",
                2015));

        // Tampilkan koleksi
        p.tampilkanKoleksi();

        System.out.println();

        // Pinjam buku
        p.pinjamBuku("Bumi");

        System.out.println();

        // Tampilkan lagi
        p.tampilkanKoleksi();

        System.out.println();

        // Kembalikan buku
        p.kembalikanBuku("Bumi");

        System.out.println();

        // Cari penulis
        p.cariPenulis("Tere Liye");

        System.out.println();

        // Jumlah tersedia
        System.out.println(
                "Jumlah buku tersedia: "
                + p.jumlahTersedia()
        );
    }
}