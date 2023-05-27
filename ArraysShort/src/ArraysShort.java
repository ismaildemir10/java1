import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysShort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizi kaç boyutlu olsun: ");
        int a = inp.nextInt();
        int[] liste=new int[a];
        for(int i = 0; i<a;i++){
            System.out.println("Eleman değeri giriniz: ");
            int b = inp.nextInt();
            liste[i] = b;
        }
        Arrays.sort(liste);
        System.out.println("sıralama: "+Arrays.toString(liste));
    }
}