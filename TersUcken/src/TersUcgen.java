import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Basamak sayısının giriniz. ");
        int a = inp.nextInt();
        for (int i = a-1;1<=i;i--){
            for (int k = 1;k<=a-i;k++){
                System.out.print(" ");
            }
            for (int j =1; j<=(2*i)-1;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}


