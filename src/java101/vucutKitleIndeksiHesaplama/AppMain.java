package java101.vucutKitleIndeksiHesaplama;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        double kg, boy, vkindex;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu (kg cinsinde) giriniz: ");
        kg = scanner.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = scanner.nextDouble();

        vkindex = kg / (boy * boy);
        System.out.println("Vücut Kitle indeksiniz: "+ vkindex);

    }
}
