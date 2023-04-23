import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci serisi kaç basamaklı olsun: ");
        int a = inp.nextInt();
        int b=1,c=0,d;
        for(int i=1;i<=a;i++){
            System.out.print(c+" ");
            d = c + b;
            c = b;
            b = d;
        }
    }
}