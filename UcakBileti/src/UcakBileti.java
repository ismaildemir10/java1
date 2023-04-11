import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km,yas,yolculukTipi;
        System.out.print("Gidilen mesafeyi km olarak giriniz: ");
        km = inp.nextInt();
        double tutar = km * 0.1;
        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();
        System.out.println("Yolculuk tipini sayıyla giriniz\n 1.Tek Yön\n 2.Gidiş Dönüş");
        yolculukTipi = inp.nextInt();
        if ((yolculukTipi==1)&&(yolculukTipi==2)) {

            switch (yolculukTipi) {
                case 1:
                    if (yas < 12) {
                        tutar = tutar / 2;
                        System.out.print("Ödemeniz gereken miktar: " + tutar);
                    } else if ((yas > 12) && (yas < 24)) {
                        tutar = tutar - tutar / 10;
                        System.out.println("Ödemeniz gereken miktar: " + tutar);
                    } else if ((yas > 24) && (yas <= 65)) {
                        System.out.println("Ödemeniz gereken miktar: " + tutar);
                    } else {
                        tutar = tutar - (tutar * 3) / 10;
                        System.out.println("Ödemeniz gereken miktar: " + tutar);
                    }
                    break;
                case 2:
                    tutar = tutar - ((tutar * 2) / 10);
                    if (yas < 12) {
                        tutar = tutar / 2;
                        System.out.print("Ödemeniz gereken miktar: " + tutar);
                    } else if ((yas > 12) && (yas < 24)) {
                        tutar = tutar - tutar / 10;
                        System.out.println("Ödemeniz gereken miktar: " + tutar);
                    } else if ((yas > 24) && (yas <= 65)) {
                        System.out.println("Ödemeniz gereken miktar: " + tutar);
                    } else {
                        tutar = tutar - (tutar * 3) / 10;
                        System.out.println("Ödemeniz gereken miktar: " + tutar);
                    }
                    break;
            }
        }
        else {
            System.out.println("Hatalı Veri Girişi");
        }



    }
}