
import java.util.Scanner;

public class kullaniciGirisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sys_kullanici = "yunus";
        String sys_parola = "12345";
        String kullanici;
        String parola;
        int hak = 3;

        System.out.println("*****************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz");
        System.out.println("*****************************");

        while (true) {

            System.out.println("kullanıcı adını giriniz : ");
            kullanici = input.nextLine();
            System.out.println("parolayı giriniz : ");
            parola = input.nextLine();

            if (kullanici.equals(sys_kullanici) && parola.equals(sys_parola)) {
                System.out.println("giriş başarılı");
                break;
            } else {
                hak--;
                if (hak == 0) {
                    System.out.println("kullanıcı adı veya parola hatalı !");
                    System.out.println("giriş hakkınız bitti, sistem bloke oldu");
                    break;
                } else {
                    System.out.println("kullanıcı adı veya parola hatalı !");
                    System.out.println(hak + " hakkınız kaldı");
                }
            }

        }
    }
}
