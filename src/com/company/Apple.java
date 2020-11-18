package com.company;

public final class Apple extends VegeteType {

    private String sort;
    private TypeDelivery TypeDelivery;
    private Sclad sclad;


    public Apple(String owner, String kind, String sort, int volumeFact,
                 TypeDelivery TypeDelivery, String nameSclad, String adressSclad) {
        super(owner, kind, volumeFact, TypeDelivery);
        this.sort = sort;
        this.TypeDelivery = TypeDelivery;
        this.sclad = setSclad(Sclad.nameSclad, Sclad.adressSclad);
    }

    public Sclad getSclad() {
        return sclad;
    }

    public void setSclad(Sclad sclad) {
        this.nameSclad = nameSclad;
        this.adressSclad = adressSclad;
    }


    public String getSort() {
        return sort;
    }

    public com.company.TypeDelivery getTypeDelivery() {
        return TypeDelivery;
    }

    public String getInfo() {
        return getInfo() + ", сорт:" + sort + ",  тип доставки:  " + TypeDelivery +
                ", склад: " + sclad.getNameSclad() + "," + sclad.getAdressSclad() + "";
    }
}
