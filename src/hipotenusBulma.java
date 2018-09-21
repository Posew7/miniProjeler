
import java.util.Scanner;

public class hipotenusBulma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("birinci kenarı giriniz : ");
        int a = input.nextInt();
        System.out.println("ikinci kenarı giriniz : ");
        int b = input.nextInt();

        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("hipotenüs : " + c);
    }
}
