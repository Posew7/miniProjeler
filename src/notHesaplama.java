
import java.util.Scanner;

public class notHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("birinci vize notunuzu giriniz : ");
        double vize1 = input.nextDouble();

        System.out.println("ikinci vize notunuzu giriniz : ");
        double vize2 = input.nextDouble();

        System.out.println("final notunuzu giriniz : ");
        double finalnot = input.nextDouble();

        double ort = (vize1 * 3 / 10) + (vize2 * 3 / 10) + (finalnot * 4 / 10);

        if (ort >= 90) {
            System.out.println("ortalama notunuz : " + ort + "  A");
        } else if (ort >= 70) {
            System.out.println("ortalama notunuz : " + ort + "  B");
        } else if (ort >= 60) {
            System.out.println("ortalama notunuz : " + ort + "  C");
        } else if (ort >= 55) {
            System.out.println("ortalama notunuz : " + ort + "  D");
        } else {
            System.out.println("ortalama notunuz : " + ort + "  F");
            System.out.println("kaldın daha çok çalışman gerek !");
        }

    }

}
