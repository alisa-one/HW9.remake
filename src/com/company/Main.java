package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        VegeteType objectA = new VegeteType("С/Х Путь", "груши", 30000,
                TypeDelivery.SCLAD_TO_MARKET);

        Apple objectB = new Apple("ОсОО Рич", "яблоки",
                600000, TypeDelivery.SCLAD_TO_FOREGN_BORDER, "Голден",
                new Sclad("БалыкчиБаза,   ", "Чуйская 12"));


        Apple objectC = new Apple("ч/п Байгожоев", "яблоки",
                800000, TypeDelivery.SCLAD_TO_AVTO, "Превосход",
                new Sclad("ТюпБаза,    ", "Ленинская 10"));




        System.out.println(objectA.toString());
        System.out.println(objectA.MakePropose());
        System.out.println("----------------------------------------------------");

        System.out.println(objectB.toString());
        System.out.println(objectB.MakePropose());
        System.out.println("----------------------------------------------------");


        System.out.println(objectC.toString());
        System.out.println(objectC.MakePropose());
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");




        objectC.clone(objectB.getOwner());

        System.out.println(objectC.toString());

    }
}
