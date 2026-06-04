package bagian3.perpustakaan;

public class Buku {

    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit;

    // Constructor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    // Getter
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Setter status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Info buku
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";

        return judul + " oleh " + penulis +
                " | Tahun: " + tahunTerbit +
                " [" + status + "]";
    }
}