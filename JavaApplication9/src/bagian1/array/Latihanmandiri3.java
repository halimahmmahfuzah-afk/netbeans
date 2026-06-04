public class Latihanmandiri3 {
    public static void main(String[] args) {

        int[] angka = {10, 21, 34, 45, 56, 67};

        int banyakGenap = 0;

        for (int nilai : angka) {
            if (nilai % 2 == 0) {
                banyakGenap++;
            }
        }

        System.out.println("Banyak angka genap = " + banyakGenap);
    }
}