import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SayiTahmin {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner inp=new Scanner(System.in);
        int number = ran.nextInt(100);
        int[] wrong=new int[5];
        System.out.println(number);
        for (int i = 0; i<5;i++){
            System.out.print("Sayıyı tahmin ediniz: ");
            int select = inp.nextInt();
            if(select>0&&select<100) {
                if (number == select) {
                    System.out.println("Doğru tahmin");
                    break;
                } else {
                    wrong[i] = select;
                    System.out.println("Kalan hakkınız " + (4 - i));
                    if (select < number) {
                        System.out.println("Değeri yükseltiniz");
                    } else {
                        System.out.println("Değeri düşürünüz");
                    }
                }
            }else {
                System.out.println("0-100 arasında değer giriniz "+(4-i)+" hakkınız kalmıştır.");
            }
        }
        System.out.println("Yanlış girilen değerler: "+ Arrays.toString(wrong));
    }
}