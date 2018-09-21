
import java.util.Scanner;

public class sayiDegistirme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int birinci_sayi;
        int ikinci_sayi;

        System.out.println("birinci sayıyı giriniz : ");
        birinci_sayi = input.nextInt();

        System.out.println("ikinci sayıyı giriniz : ");
        ikinci_sayi = input.nextInt();

        System.out.println("değişmeden önce sayılar.........");
        System.out.println("birinci sayı : " + birinci_sayi);
        System.out.println("ikinci sayı : " + ikinci_sayi);

        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;

        System.out.println("değişmeden sonra sayılar..........");
        System.out.println("birinci sayı : " + birinci_sayi);
        System.out.println("ikinci sayı : " + ikinci_sayi);

    }
}
