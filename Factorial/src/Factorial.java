import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int factorial=1,a = 1,n,r,b=1,factorial1 = 1,d=1,factorial2 =1,C,combination;
        System.out.print("Küme değeri giriniz: ");
        n = inp.nextInt();
        System.out.print("Grup sayısı: ");
        r = inp.nextInt();
        C = n-r;
        while (n>=a){
            factorial *= a;
            a++;
        }
        while (r>=b){
            factorial1 *=b;
            b++;
        }
        while (C>=d){
            factorial2 *= d;
            d++;
        }
        combination = factorial/(factorial1*factorial2);
        System.out.println("Kombinasyon  değeri: " + combination);
    }
}