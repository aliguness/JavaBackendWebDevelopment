package java101.notOrtalamasi;

import java.util.Scanner;

public class AppMain {
    // if else yapısı kullanılmadan

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen matematik notunu giriniz.");
        mat = scanner.nextInt();

        System.out.println("Lütfen fizik notunu giriniz.");
        fizik = scanner.nextInt();

        System.out.println("Lütfen kimya notunu giriniz.");
        kimya = scanner.nextInt();

        System.out.println("Lütfen turkce notunu giriniz.");
        turkce = scanner.nextInt();

        System.out.println("Lütfen Tarih notunu giriniz.");
        tarih = scanner.nextInt();

        System.out.println("Lütfen muzik notunu giriniz.");
        muzik = scanner.nextInt();

        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama = toplam/6;
        System.out.println("Not ortalaması: "+ortalama);

        String mesaj = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(mesaj);
    }
}
