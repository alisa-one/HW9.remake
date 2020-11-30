package com.company;

public abstract class AgroProduct implements Cloneable {

    private Apple owner;


    public AgroProduct(Apple owner) {
        this.owner = owner;

    }

    public Apple getOwner() {
        return owner;
    }



    @Override
    public String toString() {
        return
                "владелец:   " + owner ;
    }



    protected Apple setOwner() {
        this.owner = owner;
        return owner;
    }


    @Override
    public void clone(Apple objectB) {

    }
}
