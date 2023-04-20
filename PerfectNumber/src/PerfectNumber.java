import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sumNumber = 0;
        System.out.print("Sayı değeri giriniz: ");
        int number = inp.nextInt();
        for (int i=1;i<=number;i++){
            if(number%i==0){
                sumNumber+=i;
            }
        }
        if(2*number==sumNumber){
            System.out.println(number+" Mükemmel sayıdır.");
        }else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }

    }
}