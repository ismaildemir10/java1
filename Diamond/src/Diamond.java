import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("oluşturulmak istenilen elmas değeri; ");
        int a = inp.nextInt();
        for(int i = 1;i<=a;i++){
            for(int k=1;k<=(a-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a-1;1<=i;i--){
            for (int k = 1;k<=a-i;k++){
                System.out.print(" ");
            }
            for (int j =1; j<=(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}