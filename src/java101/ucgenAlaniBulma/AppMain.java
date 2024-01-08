package java101.ucgenAlaniBulma;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        int a, b, c;
        double uCevre;
        double alan;
//        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. kenarı giriniz: ");
        a = scanner.nextInt();

        System.out.println("2. kenarı giriniz: ");
        b = scanner.nextInt();

        System.out.println("3. kenarı giriniz: ");
        c = scanner.nextInt();

        //Üçgenin alanını 2'ye bölüp u değerinden Uçgenin alan hesabına gidildi.
         uCevre = (a+b+c)/2;
         alan = Math.sqrt((uCevre)*(uCevre-a)*(uCevre-b)*(uCevre-c));
        System.out.println("Üçgenin Alanı: "+ alan);

//        c = Math.sqrt((a*a)+(b*b));
//        System.out.println("Hipotenüs: "+ c);

    }
}
