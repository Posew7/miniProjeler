
import java.util.Scanner;

public class yemekGiris {

    public static void main(String[] args) {
        int para = 0;
        String yemek;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("girmek istediğiniz ürünü yazınız");
            yemek = input.nextLine();

            if (yemek.equals("0")) {
                break;
            } else if (yemek.equals("hamburger")) {
                para += 11;

                System.out.println("hesap : " + para);
            } else if (yemek.equals("kola")) {
                para += 7;
                System.out.println("hesap : " + para);
            } else {
                System.out.println("yanlış bir giriş yaptınız"
                        + "tekrar deneyiniz");
            }
        }
    }

}
