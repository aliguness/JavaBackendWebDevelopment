package java101.daireninAlaniVeCevresi;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        int r, merkezAcisi;
        double pi=3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = scanner.nextInt();

        System.out.print("Merkez açı ölçüsünü giriniz: ");
        merkezAcisi = scanner.nextInt();

        double alan= pi * r * r;
        double cevre= 2 * pi * r;
        double daireAlan = (pi * (r*r) *merkezAcisi) / 360;

        System.out.println("Dairenin alanı: "+ alan);
        System.out.println("Dairenin çevresi: "+ cevre);
        // ODEV
        System.out.println("Daire diliminin alanı: "+ daireAlan);

    }
}
