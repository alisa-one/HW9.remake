package com.company;

public class VegeteType extends AgroProduct {

    private String kind;
    private int volumeFact;
    private TypeDelivery TypeDelivery;
    private String owner;

    public VegeteType(String owner, String kind, int volumeFact, TypeDelivery TypeDelivery) {
        super(owner);
        this.kind = kind;
        this.volumeFact = volumeFact;
        this.TypeDelivery = TypeDelivery;
    }

    public VegeteType(String owner) {
        super(owner);
    }




    public  void MakePropose() {
        super.getOwner();
        this.kind = kind;
        this.volumeFact = volumeFact;

        System.out.println(getOwner()+
        " продает " + kind + " " + volumeFact + " тыс.т. ");
    }





    public String getKind() {
        return kind;
    }

    public int getVolumeFact() {
        return volumeFact;
    }

    public void getInfo() {
        super.getInfo();System.out.println(" вид:  " + kind + ", объем заказа:  " + volumeFact +
                " ,  тип доставки:  " + TypeDelivery);
    }



}
