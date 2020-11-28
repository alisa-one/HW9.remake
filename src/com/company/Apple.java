package com.company;

public final class Apple extends VegeteType implements Cloneable {

    private String sort;
    private Sclad Sclad;
    private static String nameSclad;
    private static String adressSclad;


    public Apple(String owner, String kind, String sort, int volumeFact,
                 TypeDelivery TypeDelivery) {
        super(owner, kind, volumeFact, TypeDelivery);
        this.sort = sort;
        this.nameSclad = nameSclad;
        this.adressSclad = adressSclad;

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


    public void getInfo() {
        super.getInfo();
        System.out.println(" сорт:" + sort +
                ", склад: " + Sclad.getNameSclad() + Sclad.getAdressSclad());
    }

    void display() {
        System.out.printf("Person %s \n", sort);}

        @Override
        public Apple clone () throws CloneNotSupportedException {

            return (Apple) super.clone();
        }
    }

