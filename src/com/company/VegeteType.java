package com.company;

public class VegeteType extends AgroProduct {

    private String kind;
    private int volumeFact;
    private TypeDelivery TypeDelivery;

    public VegeteType(String owner, String kind, int volumeFact,
                      TypeDelivery typeDelivery, Sclad Sclad) {
        super(owner,Sclad);
        this.kind = kind;
        this.volumeFact = volumeFact;
        this.TypeDelivery = typeDelivery;
    }


    public VegeteType(String owner, Sclad sclad) {
        super(owner,sclad);
    }

    public VegeteType(String owner, String kind,  int volumeFact, TypeDelivery TypeDelivery) {
        super( owner, Sclad.nameSclad,Sclad.adressSclad);

        this.kind = kind;
        this.volumeFact=volumeFact;
        this.TypeDelivery= TypeDelivery;

    }


    public String getKind() {
        return kind;
    }

    public int getVolumeFact() {
        return volumeFact;
    }

    public String getInfo() {
        return getInfo() + ", вид:  "+kind+", объем заказа:  "+volumeFact+" ";}


}
