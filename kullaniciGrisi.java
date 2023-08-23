import java.util.Scanner;

public class kullaniciGrisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if(userName.equals("abc") && (password.equals("123456"))) {
            System.out.print("Giriş Yapıldı!");
        }else {
            System.out.print("Kullanıcı Adı veya Şifre Yanlış!!");
        }



    }
}
