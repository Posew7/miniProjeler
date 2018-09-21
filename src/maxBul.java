
import java.util.Scanner;

public class maxBul {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int maks = 0;

        System.out.println("birinci sayıyı giriniz");
        a = input.nextInt();

        System.out.println("ikinci sayıyı giriniz");
        b = input.nextInt();

        System.out.println("üçüncü sayıyı giriniz");
        c = input.nextInt();

        if (a >= b && a >= c) {
            maks = a;
        } else if (b >= a && b >= c) {
            maks = b;
        } else {
            maks = c;
        }

        System.out.println("en büyük sayı : " + maks);
    }
}
