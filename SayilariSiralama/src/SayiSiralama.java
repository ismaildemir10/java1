import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c;
        System.out.print("İlk sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c = inp.nextInt();
        if ((a<b)&&(a<c)){
            if (b<c){
            System.out.println(a + " en küçüktür");
            System.out.println(b + " ortanca");
            System.out.println(c + " en büyük");
        }
            else {
            System.out.println(a + " en küçüktür");
            System.out.println(c + " ortanca");
            System.out.println(b + " en büyük");


            }

        }
        else if ((a<c)&&(a>b)) {
            System.out.println(b + " en küçüktür");
            System.out.println(a + " ortancadır");
            System.out.println(c + " en büyüktür");

        }
        else if ((a<b)&&(a>c)) {
            System.out.println(c + " en küçüktür");
            System.out.println(a + " ortancadır");
            System.out.println(b + " en büyüktür");

        }
        else if ((a>b)&&(a>c)) {
            if (b<c){
                System.out.println(b +" en küçüktür");
                System.out.println(c + " ortancadır");
                System.out.println(a + " en büyüktür");
            }
            else {
                System.out.println(c + " en küçüktür");
                System.out.println(b + " ortancadır");
                System.out.println(a + " en büyüktür");
            }

        }

    }
}