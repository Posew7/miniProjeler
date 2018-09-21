
import java.util.Scanner;

public class miniAtm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int bakiye = 1000;

        while (true) {
            System.out.println("*********************************");
            System.out.println("yapmak istediğiniz işlemi seçiniz\n"
                    + "1 - bakiye öğrenme\n"
                    + "2 - para çekme\n"
                    + "3 - para yatırma\n"
                    + "q - çıkış");
            System.out.println("*********************************");

            String islem = input.nextLine();

            if (islem.equals("q")) {
                System.out.println("çıkış yaptınız");
                break;
            } else if (islem.equals("1")) {
                System.out.println("bakiyeniz : " + bakiye);
            } else if (islem.equals("2")) {
                System.out.println("çekmek istediğiniz tutarı giriniz : ");
                int tutar = input.nextInt();
                if (bakiye - tutar < 0) {
                    System.out.println("bakiyeniz yetersiz\n"
                            + "bakiyeniz : " + bakiye);
                    input.nextInt();
                } else {
                    bakiye -= tutar;
                    System.out.println("yeni bakiyeniz : " + bakiye);
                    input.nextLine();
                }
            } else if (islem.equals("3")) {
                System.out.println("yatırmak istediğiniz tutarı giriniz : ");
                int tutar = input.nextInt();
                bakiye += tutar;
                System.out.println("yeni bakiyeniz : " + bakiye);
                input.nextLine();
            } else {
                System.out.println("hatalı giriş yaptınız");
            }

        }

    }
}
