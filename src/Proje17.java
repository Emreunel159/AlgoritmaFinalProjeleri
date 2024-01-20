import java.util.Scanner;

public class Proje17 {
    public static void main(String[] args) {
        String kelime, sesliharf = "aeıioöuüAEIİOÖUÜ";
        int harfsayisi, sayac = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen türkçe karakter(ı,ö,ü) içermeyen bir kelime giriniz");
        kelime = scn.nextLine();
        harfsayisi = kelime.length();
        for (int i = 0; i < harfsayisi; i++) {
            for (int j = 0; j < sesliharf.length(); j++) {
                if (kelime.charAt(i) == sesliharf.charAt(j)) {
                    sayac++;
                }
            }
        }
        System.out.println("kelimenizde " + sayac + " adet sesli harf vardır.");
        System.out.println("kelimenizde " + (harfsayisi - sayac) + " adet sessiz harf vardır.");
        scn.close();
    }
}