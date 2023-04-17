import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number,basNumber=0,mod,total=1,result=0,sumBasamak =0;
        System.out.print("Sayı giriniz: ");
        number = inp.nextInt();
        int tempNumber = number;
        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }
        System.out.println("Basamak sayısı: " + basNumber);
        tempNumber = number;
        while(tempNumber != 0){
            mod = tempNumber%10;
            sumBasamak += mod;
            for (int i=1;i<=basNumber;i++){
                total *=mod;
            }result += total;
            total =1;
            tempNumber/=10;
        }
        System.out.println("Basamak sayılarının toplamı: "+ sumBasamak);
        System.out.println("Armstrong hesabı: "+ result);
        if(number == result){
            System.out.println(number + " Armstrong sayıdır");
        }else {
            System.out.println("Amstrong sayı değildir.");
        }




    }
}