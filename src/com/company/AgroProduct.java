package com.company;

public class AgroProduct {

    private String owner;


    public AgroProduct(String owner) {
        this.owner =owner;

    }





    public String getOwner() {
        return owner;
    }

    public String getInfo() {
        return "Object: владелец: "+owner+ " ";
    }
}
