public class Proje8 {
   public static void main(String[] args) {
    int sayilar[] = new int[21];
    sayilar[0] = 0;
    sayilar[1] = 1;
    System.out.print("İlk 20 Fibonacci Sayısı: {"+sayilar[1]);
    for (int i = 2; i < 21; i++) {
      sayilar[i] = sayilar[i - 1] + sayilar[i - 2];
      System.out.print(","+sayilar[i]);
    }
    System.out.print("}");
  }
}