
public class asalMi {

    public static boolean asalMi(int p_sayi) {

        for (int i = 2; i < p_sayi; i++) {

            if (p_sayi % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        for (int i = 2; i < 1000; i++) {

            if (asalMi(i)) {
                System.out.print(i + " ");
            }

        }

    }

}
