public class Latihanmandiri2 {
    public static void main(String[] args) {

        String[] namaHari = {
            "Minggu",
            "Senin",
            "Selasa",
            "Kamis",
            "Sabtu"
        };

        System.out.println("Hari dengan jumlah huruf lebih dari 5:");

        for (int i = 0; i < namaHari.length; i++) {
            if (namaHari[i].length() > 5) {
                System.out.println(namaHari[i]);
            }
        }
    }
}