import java.util.Scanner;

public class IkiKuvvet {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b = 1,c = 1;
        System.out.print("Değer giriniz: ");
        a = inp.nextInt();
        while ((a>=b)) {
            System.out.println("4 Kuvvetleri: " + b);
            b *= 4;
        }
        while ((a>=c)){  System.out.println("5 Kuvvetleri: " + c);
           c *= 5;
        }


    }
}