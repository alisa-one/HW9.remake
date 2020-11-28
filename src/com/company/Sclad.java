package com.company;

public class Sclad {
    private static String nameSclad;
    private static String adressSclad;
    private static Sclad Sclad;


    public Sclad( String nameSclad, String adressSclad) {
        this.nameSclad=nameSclad;
        this.adressSclad=adressSclad;
    }

    public String getAdressSclad() {
        return adressSclad;
    }

    public static void setAdressSclad() {
        Sclad.adressSclad = adressSclad;
    }

    public String getNameSclad() {
        return nameSclad;
    }

    public static void setNameSclad() {
        Sclad.nameSclad = nameSclad;
    }

    public static com.company.Sclad getSclad() {
        return Sclad;
    }

    public  void setSclad(com.company.Sclad Sclad) {
        setNameSclad();
        setAdressSclad();

    }
}
