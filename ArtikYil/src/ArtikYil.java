import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year,artik;
        System.out.print("Yıl giriniz: ");
        year = inp.nextInt();
        artik = year%4;
        if (artik == 0){
            System.out.println(year + " Artık yıldır");
        }
        else {
            System.out.println(year +" Artık yıl değildir.");
        }


    }
}