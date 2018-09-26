
public class dizi1 {

    public static void diziBastir(int sayi[]) {

        for (int i = 0; i < 7; i++) {
            System.out.println(i + 1 + ".element " + sayi[i]);
        }

    }

    public static double ortalamaBul(int[] array) {

        int toplam = 0;

        for (int i = 0; i < array.length; i++) {

            toplam += array[i];

        }

        return (double) toplam / array.length;

    }

    public static void main(String[] args) {

        int[] a = {13, 22, 33, 44, 55, 66, 77};

        diziBastir(a);
        
        System.out.println("ortalama : "+ortalamaBul(a));

    }
}
