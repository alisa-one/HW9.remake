package com.company;

public class Sclad {

    public static String adressSclad;
    public static String nameSclad;


    public String getAdressSclad() {
        return adressSclad;
    }

    public String getNameSclad() {
        return nameSclad;
    }

    public static void setNameSclad(String nameSclad) {
        Sclad.nameSclad = nameSclad;
    }

    public static void setAdressSclad(String adressSclad) {
        Sclad.adressSclad = adressSclad;
    }

    public Sclad (String nameSclad, String adressSclad){
        this.nameSclad= nameSclad;
        this.adressSclad = adressSclad;
    }
}
