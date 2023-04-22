import java.util.Scanner;
public class AsalSSayi {
    public static void main(String[] args) {
        System.out.println("1-100 arasindaki asal sayilar:");
        for (int i = 2; i <= 100; i ++) {
        boolean asal=true;
            for (int j = 2; j <i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}