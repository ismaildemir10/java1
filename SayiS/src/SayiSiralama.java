import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int a = inp.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= a; i++) {
            System.out.print("Sayı girin: ");
            int b = inp.nextInt();
            if (b < min) {
                min = b;
            }
            else if (b > max) {
                max = b;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}