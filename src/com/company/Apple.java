package com.company;

public class Apple extends VegeteType {

    private String sort;
    private Sclad Sclad;
    private static String nameSclad;
    private static String adressSclad;


    public Apple(String owner, String kind, int volumeFact, com.company.TypeDelivery TypeDelivery,
                 String sort, com.company.Sclad sclad) {
        super(owner, kind, volumeFact, TypeDelivery);
        this.sort = sort;
        Sclad = sclad;
    }

    public void setSclad(Sclad sclad) {
        this.Sclad = sclad;
    }

    public Sclad getSclad() {
        return Sclad;
    }


    public String getSort() {

        return sort;
    }



    @Override
    public String toString() {
        return super.toString() +
                ",  сорт:  " + sort  +
                ",  имя и адрес склада: " + Sclad.getNameSclad() + Sclad.getAdressSclad() ;
    }


    @Override
    public void clone(Apple objectB) {
        super.clone(objectB.getOwner());



    }
}

