import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,total=1;
        System.out.print("Üstü alınacak olan sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("Sayının alınmak istenilen üstünü giriniz: ");
        b = inp.nextInt();
        for (int i = 1;i<=b;){
            total *= a;
            i++;
        }
        System.out.println("Sonuç: " + total);
    }
}