import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(arr);
        System.out.println("Sayi Giriniz: ");
        int a = inp.nextInt();
        for(int i=0;i<arr.length;i++){
            if(a<arr[i]){
                System.out.println("En yakın büyük değer: "+ arr[i]);
                System.out.println("En yakın küçük değer: "+ arr[i-1]);
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[arr.length-1];
        int min = arr[0];
        System.out.println("dizinin en büyük değeri: "+ max);
        System.out.println("dizinin en küçük değeri: "+ min);
    }
}