import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName,password;
        int userPassError=3,islem,money =3000,tutar;

        while(userPassError>0){
            System.out.println("Kullanıcı adını giriniz: ");
            userName = inp.nextLine();
            System.out.println("Şifrenizi giriniz: ");
            password = inp.nextLine();
            if(userName.equals("patika")&&password.equals("java123")){
                System.out.println("Hoşgeldiniz yapmak istediğiniz işlemi seçiniz: ");
                do {
                    System.out.println(" 1.Para çekmek\n 2.Para yatırmak\n 3.Bakiye sorgulamak\n 4.Çıkış");
                    islem = inp.nextInt();
                    switch (islem){
                        case 1:
                            System.out.println("Çekmek istediğiniz tutar: ");
                            tutar = inp.nextInt();
                            money-=tutar;
                            System.out.println("Kalan tutar: " + money);
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz tutar: ");
                            tutar = inp.nextInt();
                            money+=tutar;
                            System.out.println("Toplam tutar: " + money);
                            break;
                        case 3:
                            System.out.println("hesap bakiyesi: " + money);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Yanlış seçim yaptınız: ");
                    }
                }while (islem != 4);
            }else{
                System.out.println("Kalan hakkınız: " + (--userPassError));
                if(userPassError==0){
                    System.out.println("Hesabınız bloke olmuştur");
                }
            }
        }
    }
}