import java.util.Scanner;
public class EbobEkok{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı girin: ");
        int sayi1 = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı girin: ");
        int sayi2 = input.nextInt();
        int ebob = 1,i = 1;
        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        int ekok = (sayi1 * sayi2) / ebob;
        System.out.println("EBOB: " + ebob + "\tEKOK: " + ekok);
    }
}