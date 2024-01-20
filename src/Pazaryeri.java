
//                                                                 PROJE 19

public class Pazaryeri {
    String thisName;
    String thisColor;
    String thisOwnership;

    public Pazaryeri(String isim, String renk, String sahiplik) {
        thisName = isim;
        thisColor = renk;
        thisOwnership = sahiplik;
    }

    public static void main(String[] args) {
        Pazaryeri obje = new Pazaryeri("Mandalina", "Turuncu", "Yerli");
        System.out.println("Meyve: " + obje.thisName);
        System.out.println("Renk: " + obje.thisColor);
        System.out.println("Sahiplik: " + obje.thisOwnership);
    }

    public void setPazaryeriBilgileri(String isim, String renk, String sahiplik) {
        this.thisName = isim;
        this.thisColor = renk;
        this.thisOwnership = sahiplik;
    }

    public void setPazaryeriBilgileri(String isim, String renk) {
        this.thisName = isim;
        this.thisColor = renk;
    }

    public String getIsim() {
        return thisName;
    }

    public String getRenk() {
        return thisColor;
    }

    public String getSahiplik() {
        return thisOwnership;
    }

    public String PazaryeriTuru() {
        return "belirsiz";
    }

}