public class  Latihanmandiri1 {
    public static void main(String[] args) {

        double[] suhuHarian = {29.5, 31.0, 27.8, 33.2, 30.1, 28.4};

        double max = suhuHarian[0];
        double min = suhuHarian[0];

        for (double suhu : suhuHarian) {
            if (suhu > max) {
                max = suhu;
            }

            if (suhu < min) {
                min = suhu;
            }
        }

        System.out.println("Suhu tertinggi : " + max);
        System.out.println("Suhu terendah  : " + min);
    }
}