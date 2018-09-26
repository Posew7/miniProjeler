
import java.util.Scanner;

public class zamanlayici {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long start = System.currentTimeMillis();

        System.out.println("adınız :");
        String ad = input.nextLine();

        System.out.println("soyadınız :");
        String soyad = input.nextLine();

        System.out.println("yaşınız :");
        int yas = input.nextInt();

        long stop = System.currentTimeMillis();

        long sonuc = stop - start;
        sonuc /= 1000;

        System.out.println("sonuc " + sonuc + " saniye");

    }
}
