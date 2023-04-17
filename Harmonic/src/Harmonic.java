import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a,b,c=0;
        System.out.println("değer giriniz: ");
        a = inp.nextDouble();
        for (double i = 1;i<=a;i++){
            c +=(1/i);
        }
        System.out.println("Harmonik değer: " + c);
    }
}