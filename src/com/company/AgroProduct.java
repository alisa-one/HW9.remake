package com.company;

public class AgroProduct {

    private String owner;


    public AgroProduct(String owner, Sclad sclad) {
        this.owner =owner;

    }

    public AgroProduct(String s, String nameSclad, String owner) {
        this.owner =owner;
    }




    public String getOwner() {
        return owner;
    }

    public String getInfo() {
        return "Object: владелец: "+owner+ " ";
    }
}
