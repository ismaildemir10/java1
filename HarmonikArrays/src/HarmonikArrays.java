import java.util.Scanner;
import java.util.ArrayList;
public class HarmonikArrays {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Harmonik toplanmak istenen eleman sayısını giriniz ");
        int n = inp.nextInt();
        double sayi=0;
        ArrayList<Double> harmonikSayilar = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            double harmonik = 1.0 / i;
            harmonikSayilar.add(harmonik);
            sayi+=harmonik;
        }
        System.out.println(harmonikSayilar);
        System.out.println(sayi);
    }
}