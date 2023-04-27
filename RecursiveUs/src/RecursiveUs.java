import java.util.Scanner;

public class RecursiveUs {
    static int us(int a, int b){
        int result =1;
        for (int i=1;i<=b;i++){
        result*=a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("Üstünü almak istediğiniz sayıyı giriniz: ");
        int a= inp.nextInt();
        System.out.println("Kaç kere üs almak istersiniz: ");
        int b = inp.nextInt();
        System.out.println(us(a,b));
    }
}