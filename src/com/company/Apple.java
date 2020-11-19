package com.company;

public final class Apple extends VegeteType {

    private String sort;
    private Sclad sclad;


    public Apple(String owner, String kind, String sort, int volumeFact,
                 TypeDelivery TypeDelivery, String nameSclad, String adressSclad) {
        super(owner, kind, volumeFact, TypeDelivery);
        this.sort = sort;
        this.sclad = setSclad(Sclad.setNameSclad, Sclad.setAdressSclad);
    }

    public Sclad getSclad() {
        return sclad;
    }

    public void setSclad(Sclad sclad) {
        this.sclad.setNameSclad() = sclad.getNameSclad();
        this.sclad.setAdressSclad() = sclad.getAdressSclad();

        ;
    }

    public String getSort() {
        return sort;
    }


    public String getInfo() {
        return getInfo() + ", сорт:" + sort +
                ", склад: " + sclad.getNameSclad() + "," + sclad.getAdressSclad() + "";
    }
}
