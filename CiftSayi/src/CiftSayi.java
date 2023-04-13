import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k,i = 0;
        System.out.println("Değer giriniz: ");
        k = inp.nextInt();
        while (i <= k){
            i++;
            if((i%3==0)&&(i%4==0))
                System.out.println(i);
        }
    }
}