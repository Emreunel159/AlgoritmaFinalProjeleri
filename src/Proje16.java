import java.util.Scanner;
import java.util.Random;

public class Proje16 {
    public static void main(String[] args) {
        char karakter;
        String metin;
        int sayac = 0;
        Random rnd = new Random();
        int sayi = rnd.nextInt(2);
        Scanner scn = new Scanner(System.in);
        if (sayi == 0) {
            metin = "Öğretmen derste; sınavda çıkacak konuları söylüyordu ama sınavı umursamayan öğrenciler öğretmeni dinlemiyordu";
            System.out.println(metin);
            System.out.println();
            System.out.print("Bulmak istediğiniz harfi giriniz: ");
            karakter = scn.next().charAt(0);
            for (int i = 0; i < metin.length(); i++) {
                if (metin.charAt(i) == karakter) {
                    sayac++;
                }
            }
            System.out.println("Metinde " + sayac + " tane '" + karakter + "' harfi vardır");
        }
        if (sayi == 1) {
            metin = "Parlak mavi ayın parıltılı ışığı şelaleden düşen sudan yansıyarak sol gözünde belirsiz şekillerin oluşmasıyla korkunç ve devasa halisülasyonlar görmesine neden oldu.";
            System.out.println(metin);
            System.out.println();
            System.out.print("Bulmak istediğiniz harfi giriniz: ");
            karakter = scn.next().charAt(0);
            for (int i = 0; i < metin.length(); i++) {
                if (metin.charAt(i) == karakter) {
                    sayac++;
                }
            }
            System.out.println("Metinde " + sayac + " tane '" + karakter + "' harfi vardır");
        }
        if (sayi == 2) {
            metin = "Normal cümleleri doğru kurmanın birinci yolu çok kitap okumak ve bu şekilde dile hakim olmaktır. Kitap okumak insanın dil konusunda ve yazı yazma konusunda çok başarılı olmasının anahtarıdır.";
            System.out.println(metin);
            System.out.println();
            System.out.print("Bulmak istediğiniz harfi giriniz: ");
            karakter = scn.next().charAt(0);
            for (int i = 0; i < metin.length(); i++) {
                if (metin.charAt(i) == karakter) {
                    sayac++;
                }
            }
            System.out.println("Metinde " + sayac + " tane '" + karakter + "' harfi vardır");
        }
        scn.close();
    }
}