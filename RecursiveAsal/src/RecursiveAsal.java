import java.util.Scanner;

public class RecursiveAsal {
    static void asal(int number){
        boolean b = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                b = false;
                break;
            }
        }System.out.println(number + (b ? " asal bir sayıdır." : " asal bir sayı değildir."));
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = inp.nextInt();
        asal(a);
    }
}