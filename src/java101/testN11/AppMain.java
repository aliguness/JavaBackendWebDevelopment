package java101.testN11;

import java.util.Scanner;

public class AppMain {

    /**
     * __define-ocg__ Bu fonksiyon, bir string'i alır ve string'in, noktalama işaretleri
     * ve semboller dikkate alınmaksızın bir palindrom olup olmadığını kontrol eder.
     *
     * @param str Palindrom kontrolü yapılacak giriş string'i.
     * @return String, eğer string bir palindrom ise true, değilse false.
     */
    public static String StringChallenge(String str) {
        // Alfa numerik olmayan karakterleri kaldır ve küçük harfe çevir
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Temizlenmiş string'i tersine çevir
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        // Temizlenmiş string'in tersine çevrilmiş hali ile eşit olup olmadığını kontrol et
        boolean isPalindrome = cleanedStr.equals(reversedStr);

        // Sonucu true veya false olarak string olarak döndür
        return String.valueOf(isPalindrome);
    }

    public static void main(String[] args) {
        // Bu fonksiyon çağrısını burada tut
        Scanner s = new Scanner(System.in);
        System.out.println(StringChallenge(s.nextLine()));
    }
}
