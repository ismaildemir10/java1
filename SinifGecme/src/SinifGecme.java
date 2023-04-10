import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double mat,fiz,turk,kim,muz,ortalama;
        System.out.print("matematik notunuz: ");
        mat = inp.nextDouble();
        System.out.print("fizik notunu giriniz: ");
        fiz = inp.nextDouble();
        System.out.print("türkçe notunu giriniz: ");
        turk = inp.nextDouble();
        System.out.print("kimya notunu giriniz: ");
        kim = inp.nextDouble();
        System.out.print("müzik notunu giriniz: ");
        muz = inp.nextDouble();
        ortalama = (mat + fiz + turk + kim + muz)/5;
        if (ortalama<55){
            System.out.println("sınıfta kaldınız");
        }
        else {
            System.out.println("sınıfı geçtiniz");
        }
        System.out.println("ortalamanız: " + ortalama);

    }

}