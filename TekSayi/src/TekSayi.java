import java.util.Scanner;
public class TekSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int toplam = 0,a;
        do {
            System.out.print("Sayi giriniz: ");
            a = inp.nextInt();
            if((a % 2 ==0)&&(a % 4 ==0)) {
                toplam += a;
            }
        }while (a % 2 == 0);
        System.out.println("toplamı: " + toplam);
    }
}