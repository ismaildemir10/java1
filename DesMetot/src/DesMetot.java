import java.util.Scanner;

public class DesMetot {
    static void recursive(int n){
        if (n <= 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recursive(n-5);
        System.out.println(n);
        return;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int x = inp.nextInt();
        recursive(x);
    }
}