import java.util.Scanner;

public class Account {
    static void top(double a,double b){
        double result = a+b;
        System.out.println("toplamı: "+ result);
    }
    static void cık(double a,double b){
        double result = a-b;
        System.out.println("farkı: "+ result);
    }
    static void carp(double a,double b){
        double result = a*b;
        System.out.println("çarpımı: "+ result);
    }
    static void bol(double a,double b){
        double result = a/b;
        System.out.println("bölümü: "+ result);
    }
    static void us(double a,double b){
        double result =1;
        for (int i = 1; i<=b;i++){
            result *=a;
        }
        System.out.println("üs hesabı: "+ result);
    }
    static void fac(int a){
        int result = 1;
        for (int i = 1;i<=a;i++){
            result *=i;
        }System.out.println("toplamı: "+ result);
    }
    static void mod(double a,double b){
        double result;
        result = a%b;
        System.out.println("Kalanı: "+ result);
    }
    static void alan(int a,int b){
        System.out.println("çevresi: " + (2*(a+b)));
        System.out.println("alanı: "+ (a*b));
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c;
        boolean d=true;
        while(d){
            System.out.println("1.toplama\n2.çıkarma\n3.çarpma\n4.bölme\n5.üs hesabı\n6.faktöriyel hesabı\n7.mod alma\n8.dikdörtgen alan ve çevre hesabı");
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            c =inp.nextInt();
           switch (c) {
                case 1:
                    System.out.println("İlk sayıyı giriniz: ");
                    a = inp.nextByte();
                    System.out.println("İkinci sayıyı giriniz: ");
                    b = inp.nextByte();
                    top(a,b);
                    break;
                case 2:
                    System.out.println("İlk sayıyı giriniz: ");
                    a = inp.nextByte();
                    System.out.println("İkinci sayıyı giriniz: ");
                    b = inp.nextByte();
                    cık(a, b);
                    break;
                case 3:
                    System.out.println("İlk sayıyı giriniz: ");
                    a = inp.nextByte();
                    System.out.println("İkinci sayıyı giriniz: ");
                    b = inp.nextByte();
                    carp(a, b);
                    break;
                case 4:
                    System.out.println("İlk sayıyı giriniz: ");
                    a = inp.nextByte();
                    System.out.println("İkinci sayıyı giriniz: ");
                    b = inp.nextByte();
                    bol(a, b);
                    break;
                case 5:
                    System.out.println("Sayıyı giriniz: ");
                    a = inp.nextByte();
                    System.out.println("Almak istediğiniz üs miktarını giriniz: ");
                    b = inp.nextByte();
                    us(a, b);
                    break;
                case 6:
                    System.out.println("Sayıyı giriniz: ");
                    a = inp.nextByte();
                    fac(a);
                    break;
                case 7:
                    System.out.println("İlk sayıyı giriniz: ");
                    a = inp.nextByte();
                    System.out.println("İkinci sayıyı giriniz: ");
                    b = inp.nextByte();
                    mod(a, b);
                    break;
                case 8:
                    System.out.println("İlk sayıyı giriniz: ");
                    a = inp.nextByte();
                    System.out.println("İkinci sayıyı giriniz: ");
                    b = inp.nextByte();
                    alan(a, b);
                    break;
               case 9:
                   d=false;
                   break;
               default:
                   System.out.println("Yanlış seçim yaptınız");
           }

        }

    }
}