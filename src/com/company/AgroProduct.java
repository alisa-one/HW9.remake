package com.company;

public abstract class AgroProduct implements volumeChekable {

    private String owner;



    public AgroProduct(String owner) {
        this.owner = owner;

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) throws CloneNotSupportedException {
        if (getOwner()=="ОсОО Рич") {
            this.owner = owner;
            clone();
        } else {
            throw new CloneNotSupportedException("Свойства объекта не клонируются ");

        }

        this.owner = owner;
    }

    public void getInfo() {
        System.out.println(" владелец: " + owner + " ");
    }


    public void MakePropose() {

    }


}
