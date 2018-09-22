
import java.util.Scanner;

public class gelismisHesapMak {

    public static int cikarma(int a, int b) {
        return (a - b);
    }

    public static double bolme(int a, int b) {
        return (double) (a / b);
    }

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int carpma(int a, int b) {
        return (a * b);
    }

    public static int carpma(int a, int b, int c) {
        return (a * b * c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("1. toplama işlemi\n"
                + "2. çıkarma işlemi\n"
                + "3. çarpma işlemi \n"
                + "4. bölme işlemi\n"
                + "çıkmak için q'ya basınız");
        System.out.println("**************************");

        while (true) {
            System.out.println("yapmak istediğiniz işlemi seçiniz");
            String islem = input.nextLine();

            if (islem.equals("q")) {
                System.out.println("çıkış yaptınız");
                break;
            } else if (islem.equals("1")) {
                System.out.println("yapmak istediğiniz toplama kaç sayıdan oluşuyor  (2 veya 3)");
                int toplama_sayi = input.nextInt();
                if (toplama_sayi == 2) {
                    System.out.println("birinci sayıyı giriniz");
                    int sayi1 = input.nextInt();
                    System.out.println("ikinci sayıyı giriniz");
                    int sayi2 = input.nextInt();
                    System.err.println("sonuç : " + toplama(sayi1, sayi2));
                    input.nextLine();

                } else if (toplama_sayi == 3) {
                    System.out.println("birinci sayıyı giriniz");
                    int sayi1 = input.nextInt();
                    System.out.println("ikinci sayıyı giriniz");
                    int sayi2 = input.nextInt();
                    System.out.println("üçüncü sayıyı giriniz");
                    int sayi3 = input.nextInt();
                    System.err.println("sonuç : " + toplama(sayi1, sayi2, sayi3));
                    input.nextLine();

                } else {
                    System.out.println("yanlış bir giriş yaptınız, tekrar deneyiniz");
                    input.nextLine();

                }
            } else if (islem.equals("2")) {
                System.out.println("birinci sayıyı giriniz");
                int sayi1 = input.nextInt();
                System.out.println("ikinci sayıyı giriniz");
                int sayi2 = input.nextInt();
                System.err.println("sonuç : " + cikarma(sayi1, sayi2));
                input.nextLine();

            } else if (islem.equals("3")) {
                System.out.println("yapmak istediğiniz çarpma işlemi kaç sayıdan oluşuyor");
                int carpma_sayi = input.nextInt();
                if (carpma_sayi == 2) {
                    System.out.println("birinci sayıyı giriniz");
                    int sayi1 = input.nextInt();
                    System.out.println("ikinci sayıyı giriniz");
                    int sayi2 = input.nextInt();
                    System.err.println("sonuç : " + carpma(sayi1, sayi2));
                    input.nextLine();

                } else if (carpma_sayi == 3) {
                    System.out.println("birinci sayıyı giriniz");
                    int sayi1 = input.nextInt();
                    System.out.println("ikinci sayıyı giriniz");
                    int sayi2 = input.nextInt();
                    System.out.println("üçüncü sayıyı giriniz");
                    int sayi3 = input.nextInt();
                    System.err.println("sonuç : " + carpma(sayi1, sayi2, sayi3));
                    input.nextLine();

                }
            } else if (islem.equals("4")) {
                System.out.println("birinci sayıyı giriniz");
                int sayi1 = input.nextInt();
                System.out.println("ikinci sayıyı giriniz");
                int sayi2 = input.nextInt();
                System.err.println("sonuç : " + bolme(sayi1, sayi2));
                input.nextLine();

            }

        }
    }
}
