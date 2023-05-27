import java.util.Arrays;

public class ArraysFrekans {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] sayiTekrarlari = new int[dizi.length];
        boolean[] ziyaretEdildi = new boolean[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            if (ziyaretEdildi[i]) {
                continue;
            }
            int tekrarSayisi = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    tekrarSayisi++;
                    ziyaretEdildi[j] = true;
                }
            }
            sayiTekrarlari[i] = tekrarSayisi;
        }
        for (int i = 0; i < dizi.length; i++) {
            if (sayiTekrarlari[i] > 0) {
                System.out.println(dizi[i] + " sayısı " + sayiTekrarlari[i] + " kere tekrar edildi.");
            }
        }
    }
}