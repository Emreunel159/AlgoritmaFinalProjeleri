import java.util.Scanner;

public class Proje13 {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3;
        Scanner scn = new Scanner(System.in);
        System.out.println("Üçgenin 1. kenarını giriniz");
        kenar1 = scn.nextInt();
        System.out.println("Üçgenin 2. kenarını giriniz");
        kenar2 = scn.nextInt();
        System.out.println("Üçgenin 3. kenarını giriniz");
        kenar3 = scn.nextInt();

        if (kenar1 > 0 && kenar2 > 0 && kenar3 > 0) {
            if (Math.abs(kenar2 - kenar3) < kenar1 && kenar1 < kenar2 + kenar3 &&
                Math.abs(kenar1 - kenar3) < kenar2 && kenar2 < kenar1 + kenar3 &&
                Math.abs(kenar1 - kenar2) < kenar3 && kenar3 < kenar1 + kenar2) {

                System.err.print("Girdiğiniz kenarlar Üçgen Oluşturur ");

                if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 == kenar3) {
                    System.out.print("ve Eşkenar Üçgendir.");
                } else if (kenar1 != kenar2 && kenar2 != kenar3 && kenar1 != kenar3) {
                    System.out.print("ve Çeşitkenar Üçgendir.");
                } else if (kenar1 == kenar2 || kenar2 == kenar3 || kenar1 == kenar3) {
                    System.out.print("ve İkizkenar Üçgendir.");
                } else if (kenar1 == 90 || kenar2 == 90 || kenar3 == 90) {
                    System.out.print("ve Dikkenar Üçgendir.");
                }
            }
            else 
            {
                System.out.println("Girdiğiniz kenarlar Üçgen Oluşturmaz.");
            }
        } 
        else 
        {
            while (kenar1 < 1 || kenar2 < 1 || kenar3 < 1) {
                System.out.println();
                System.out.println("Üçgenin kenarı 0 ve 0'dan küçük olamaz. Lütfen 0'dan büyük değer giriniz.");
                System.out.println();
                if (kenar1 < 1) {
                    System.out.println("Üçgenin 1. kenarını yeniden giriniz");
                    kenar1 = scn.nextInt();
                }
                if (kenar2 < 1) {
                    System.out.println("Üçgenin 2. kenarını yeniden giriniz");
                    kenar2 = scn.nextInt();
                }
                if (kenar3 < 1) {
                    System.out.println("Üçgenin 3. kenarını yeniden giriniz");
                    kenar3 = scn.nextInt();
                }
                if (Math.abs(kenar2 - kenar3) < kenar1 && kenar1 < kenar2 + kenar3 &&
                    Math.abs(kenar1 - kenar3) < kenar2 && kenar2 < kenar1 + kenar3 &&
                    Math.abs(kenar1 - kenar2) < kenar3 && kenar3 < kenar1 + kenar2) {

                System.err.print("Girdiğiniz kenarlar Üçgen Oluşturur ");

                if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 == kenar3) {
                    System.out.print("ve Eşkenar Üçgendir.");
                } else if (kenar1 != kenar2 && kenar2 != kenar3 && kenar1 != kenar3) {
                    System.out.print("ve Çeşitkenar Üçgendir.");
                } else if (kenar1 == kenar2 || kenar2 == kenar3 || kenar1 == kenar3) {
                    System.out.print("ve İkizkenar Üçgendir.");
                } else if (kenar1 == 90 || kenar2 == 90 || kenar3 == 90) {
                    System.out.print("ve Dikkenar Üçgendir.");
                }
                } 
                else 
                {
                System.out.println("Girdiğiniz kenarlar Üçgen Oluşturmaz.");
                }          
            }
        }
    scn.close();
    }
}