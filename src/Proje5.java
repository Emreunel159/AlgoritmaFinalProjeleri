import java.util.Scanner;

public class Proje5 {
    public static void main(String[] args) throws Exception {
        int sayi,gsayi, onbinler, binler, yuzler, onlar;
        Scanner scn = new Scanner(System.in);
        System.out.println("5 Basamaklı bir sayı giriniz");
        sayi = scn.nextInt();
        while (sayi < 10000 || sayi > 99999) {
            System.out.println("Lütfen 5 Basamaklı Sayı giriniz");
            sayi = scn.nextInt();
        }
        gsayi=sayi;

        onbinler = sayi / 10000;
        sayi = sayi - (onbinler * 10000);
        binler = sayi / 1000;
        sayi = sayi - (binler * 1000);
        yuzler = sayi / 100;
        sayi = sayi - (yuzler * 100);
        onlar = sayi / 10;
        sayi = sayi - (onlar * 10);

        System.out.println(gsayi+"'nin onbinler basamağı: "+onbinler);
        System.out.println(gsayi+"'nin binler basamağı: "+binler);
        System.out.println(gsayi+"'nin yüzler basamağı: "+yuzler);
        System.out.println(gsayi+"'nin onlar basamağı: "+onlar);
        System.out.println(gsayi+"'nin birler basamağı: "+sayi);
        
        scn.close();
    }
}