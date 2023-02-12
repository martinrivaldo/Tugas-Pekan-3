import java.util.Scanner;

public class Tugas2B {
    public static void main(String[] args) {

        luasLingkaran();

        volumeBalok();
    }


    private static void luasLingkaran(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkaran : ");
        double jari2 = scanner.nextDouble();
        double luasLingkaran = Math.PI * jari2 * jari2;
        System.out.printf("Luas lingkaran adalah : %.2f\n" , luasLingkaran);
    }

    private static void volumeBalok(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan panjang balok : ");
        double panjang = scanner.nextDouble();
        System.out.println("Masukkan lebar balok : ");
        double lebar = scanner.nextDouble();
        System.out.println("Masukkan tinggi balok : ");
        double tinggi = scanner.nextDouble();

        double volume = panjang * lebar * tinggi;
        System.out.printf("Volume balok adalah %.2f",volume);
    }
}
