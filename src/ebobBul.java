
import java.util.Scanner;

public class ebobBul {

    public static int ebobBulma(int p_sayi1, int p_sayi2) {

        int ebob = 1;

        for (int i = 1; i <= p_sayi1 && i <= p_sayi2; i++) {

            if ((p_sayi1 % i == 0) && (p_sayi2 % i == 0)) {
                ebob = i;
            }

        }
        return ebob;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int sayi2 = input.nextInt();

        System.out.println(ebobBulma(sayi1, sayi2));

    }
}
