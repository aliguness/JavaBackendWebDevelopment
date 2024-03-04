package java101.manavKasaProgrami;
/**
 * @author Ali Güneş
 * @since march 04 2024
 */

import java.util.Scanner;
public class AppMain {
    public static void main(String[] args) {
        // MEYVELER
        double perKgArmut = 2.14, perKgElma=3.67, perKgDomates=1.11, perKgMuz=0.95, perKgPatlican=5.00, totalPrice=0;
        int armut, elma, domates, muz, patlican;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Kaç kilogram Armut aldığınızı sayı ile giriniz.");
        armut = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Lütfen Kaç kilogram Elma aldığınızı sayı ile giriniz.");
        elma = scanner.nextInt();

        System.out.println("Lütfen Kaç kilogram Domates aldığınızı sayı ile giriniz.");
        domates = scanner.nextInt();

        System.out.println("Lütfen Kaç kilogram Muz aldığınızı sayı ile giriniz.");
        muz =scanner.nextInt();

        System.out.println("Lütfen Kaç kilogram Patlıcan aldığınızı sayı ile giriniz.");
        patlican =scanner.nextInt();

        System.out.println("Armut Kaç Kilo ? :"+armut);
        System.out.println("Elma Kaç Kilo ? :"+elma);
        System.out.println("Domates Kaç Kilo ? :"+domates);
        System.out.println("Muz Kaç Kilo ? :"+muz);
        System.out.println("Patlıcan Kaç Kilo ? :"+patlican);

        totalPrice = (perKgArmut*armut) + (perKgElma * elma) + (perKgDomates * domates) + (perKgMuz * muz) + (perKgPatlican * patlican);
        System.out.println("Toplam Tutar : "+totalPrice+ " TL");

    }
}
