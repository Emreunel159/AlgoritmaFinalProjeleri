import java.util.Scanner;

public class Proje7 {
    public static void main(String[] args) {
        int sayi[] = new int[10];
        double elliust = 0, ellialt = 0, sonuc;
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Sayıyı Giriniz");
            sayi[i] = scn.nextInt();
            if (sayi[i] >= 50) {
                elliust = elliust + sayi[i];
            }
            if (sayi[i] < 50) {
                ellialt = ellialt + sayi[i];
            }
        }
        sonuc = elliust / ellialt;
        System.out.println("50 ve Üstü olanların toplamı: " + (int)elliust);
        System.out.println("50 Altı olanların toplamı: " + (int)ellialt);
        System.out.println("50 ve üstü olanlarının toplamının 50'den küçük olan sayıların toplamına oranı: " + sonuc);
        scn.close();
    }
}