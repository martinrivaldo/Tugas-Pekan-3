import java.util.Scanner;

public class Tugas1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.a
        String nama = scanner.nextLine();
        System.out.printf("Selamat datang di bootcamp Kawah Edukasi, %s.\n" , nama);


        // 1.b
        short firstNumber = 12, secondNumber = 1;
        double firstDesimal = 12.3, secondDesimal = 9.2;
        char firstChar = 'A', secondChar = 'B';
        boolean isTrue = true, isFalse = false;

        // 1.c
        String kata1 = "Saya senang";
        String kata2 = "belajar";
        String kata3 = "Java Language";
        System.out.printf("%s %s %s.", kata1,kata2,kata3);
    }
}
