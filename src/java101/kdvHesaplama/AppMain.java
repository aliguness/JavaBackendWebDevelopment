package java101.kdvHesaplama;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        double girilenFiyat;
        double toplam;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir fiyat giriniz");
        girilenFiyat= scanner.nextDouble();

        double kdvOrani = (girilenFiyat < 1000 && girilenFiyat > 0) ? 0.18 :0.08;
        double kdvTutari = girilenFiyat * kdvOrani;
        System.out.println("KDV Tutarı: "+kdvTutari);

        toplam =girilenFiyat + kdvTutari;
        System.out.println("KDV'li Toplam Fiyat: "+ toplam);





    }
}
