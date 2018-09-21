
import java.util.Scanner;

public class faiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("bankamıza hoşgeldiniz, vade oranı : %7 ");
        System.out.println("****************************");

        double anapara;
        double vade;
        double vadeOranı = 0.07;

        System.out.println("yatırmak istediğiniz parayı giriniz");
        anapara = input.nextDouble();
        System.out.println("kaç ay vadeli hesap açmak istersiniz ?");
        vade = input.nextDouble();

        for (int i = 1; i <= vade; i++) {

            anapara = (anapara * vadeOranı) + anapara;

            System.out.println(i + " .ayın parası : " + anapara);

        }

    }
}
