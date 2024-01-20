import java.util.Scanner;

public class Proje9 {
    public static void main(String[] args) {
        int sayi,uzunluk = 0,gsayi;
        Scanner scn = new Scanner(System.in);
        System.out.println("Decimal bir sayı girin");
        sayi = scn.nextInt();
        gsayi=sayi;

        int dizi[] = new int[20];

        while (sayi > 0) {
            dizi[uzunluk++] = sayi % 2;
            sayi = sayi / 2;
        }
        System.out.print(gsayi+" Sayısının binary'deki karşılığı: ");
        for (int i = uzunluk - 1; i >= 0; i--) {
            System.out.print(dizi[i]);
        }
      scn.close();
    }
}