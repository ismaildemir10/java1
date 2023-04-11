import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int day,month;
        System.out.print("Doğduğunuz Ayı Giriniz: ");
        month = inp.nextInt();
        if(month<13){

        System.out.print("Doğduğunuz Günü Giriniz: ");
        day = inp.nextInt();

        if(month == 1 ){
            if((1 <= day) && (day <= 21)){
                System.out.println("Oğlak");
            }
            else if ((21 < day) && (30 >= day)) {
                System.out.println("Kova");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }
        else if(month == 2 ){
            if((1 <= day) && (day <= 19)){
                System.out.println("Kova");
            }
            else if ((19 < day) && (28 >= day)) {
                System.out.println("Balık");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }
        else if(month == 3 ){
            if((1 <= day) && (day <= 20)){
                System.out.println("Balık");
            }
            else if ((20 < day) && (30 >= day)) {
                System.out.println("Koç");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }
        else if(month == 4 ){
            if((1 <= day) && (day <= 20)){
                System.out.println("Koç");
            }
            else if ((20 < day) && (30 >= day)) {
                System.out.println("Boğa");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }
        else if(month == 5 ){
            if((1 <= day) && (day <= 21)){
                System.out.println("Boğa");
            }
            else if ((21 < day) && (30 >= day)) {
                System.out.println("İkizler");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }
        else if(month == 6 ){
            if((1 <= day) && (day <= 22)){
                System.out.println("İkizler");
            }
            else if ((22 < day) && (30 >= day)) {
                System.out.println("Yengeç");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }
        else if(month == 7 ){
            if((1 <= day) && (day <= 22)){
                System.out.println("Yengeç");
            }
            else if ((22 < day) && (30 >= day)) {
                System.out.println("Aslan");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }
        else if(month == 8 ){
            if((1 <= day) && (day <= 22)){
                System.out.println("Aslan");
            }
            else if ((22 < day) && (30 >= day)) {
                System.out.println("Başak");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }
        else if(month == 9 ){
            if((1 <= day) && (day <= 22)){
                System.out.println("Başak");
            }
            else if ((22 < day) && (30 >= day)) {
                System.out.println("Terazi");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }
        else if(month == 10 ){
            if((1 <= day) && (day <= 22)){
                System.out.println("Terazi");
            }
            else if ((22 < day) && (30 >= day)) {
                System.out.println("Akrep");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }
        else if(month == 11 ){
            if((1 <= day) && (day <= 21)){
                System.out.println("Akrep");
            }
            else if ((21 < day) && (30 >= day)) {
                System.out.println("Yay");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }
        else if(month == 12 ){
            if((1 <= day) && (day <= 21)){
                System.out.println("Yay");
            }
            else if ((21 < day) && (30 >= day)) {
                System.out.println("Oğlak");
            }
            else {
                System.out.println("yanlış gün girdiniz");
            }
        }

    }
        else {
            System.out.println("Ay için yanlış değer girdiniz");
        }
    }
}