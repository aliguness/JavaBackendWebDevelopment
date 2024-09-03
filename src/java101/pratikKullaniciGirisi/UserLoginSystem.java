package java101.pratikKullaniciGirisi;

import java.util.Scanner;

public class UserLoginSystem {

    private String userName;
    private String password;
    private final Scanner scanner;

    public UserLoginSystem(){
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        UserLoginSystem system = new UserLoginSystem();
        system.setupUser();
        system.login();
        system.scanner.close();

    }

    //username ve password oluşturma kısmı
    private void setupUser(){
        System.out.println("Kullanıcı adı ve şifre oluşturun.");
        System.out.println("Kullanıcı Adı: ");
        userName = scanner.nextLine();
        System.out.println("Şifre: ");
        password = scanner.nextLine();

    }

    // Login işlemi
    private void login(){
        while (true){
            System.out.println("\nKullanıcı Girişi");
            System.out.print("Kullanıcı adı: ");
            String inputUserName = scanner.nextLine();
            System.out.println("Şifre: ");
            String inputPassword = scanner.nextLine();

            if (authenticate(inputUserName, inputPassword)){
                System.out.println("Giriş başarılı");
                break;
            }else {
                System.out.println("Hatalı şifre veya kullanıcı adı.");
                System.out.println("Şifrenizi değiştirmek ister misiniz? (evet/hayır)");
                String resetPasswordResponse = scanner.nextLine();

                if (resetPasswordResponse.equalsIgnoreCase("evet")){
                    resetPassword();
                }else {
                    System.out.println("Tekrar giriş yapmayı deneyin.");
                }
            }
        }
    }

    //kullanıcı kimlik doğrulama metodu
    private boolean authenticate(String inputUserName, String inputPassword){
        return userName.equals(inputUserName) && password.equals(inputPassword);
    }

    // şifre sıfırlama metodumuz
    private void resetPassword(){
        while (true){
            System.out.println("Yeni Şifre: ");
            String newPassword = scanner.nextLine();

            if (newPassword.equals(password)){
                System.out.println("Şifre oluşturulamadı, başka bir şifre giriniz");
            }else {
                password = newPassword;
                System.out.println("Şifre başarıyla oluşturuldu.");
                break;
            }

        }
    }

}
