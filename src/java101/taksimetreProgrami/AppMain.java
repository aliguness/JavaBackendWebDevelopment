package java101.taksimetreProgrami;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz: ");
        km = scanner.nextInt();

        total = km * perKm;
        total +=startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: "+ total);

    }
}