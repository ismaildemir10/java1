import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double sicaklik;
        System.out.print("Sıcaklık değeri giriniz: ");
        sicaklik = inp.nextDouble();
        if (sicaklik < 5) {
            System.out.println("Kayak yapmak için elverişli sıcaklık");
        }
        else if ((sicaklik >= 5) && (sicaklik < 15)) {
            System.out.println("Sinema için uygun hava koşulları");

        }
        else if ((sicaklik >= 15)&&(sicaklik<25)) {
            System.out.println("Piknik için uygun hava koşulları");

        }
        else {
            System.out.println("Yüzme etkinliği için güzel hava");
        }
    }
}