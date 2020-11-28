package com.company;

public class Main {

    public static void main(String[] args) {

        VegeteType objectA = new VegeteType("С/Х Путь", "груши", 30000,
                TypeDelivery.SCLAD_TO_MARKET);


        Apple objectB = new Apple("ОсОО Рич", "яблоки",
                "Голден", 800000,
                TypeDelivery.SCLAD_TO_FOREGN_BORDER);
        objectB.setSclad(new Sclad("БалыкчиБаза,   ", "Чуйская 12"));


        Apple objectC = new Apple("ч/п Байгожоев", "яблоки", "Превосход", 600000,
                TypeDelivery.SCLAD_TO_AVTO);
        objectC.setSclad(new Sclad("ТюпБаза,    ", "Ленинская 8"));


        objectA.getInfo();
        objectA.MakePropose();
        System.out.println("--------------------------------------------------");

        objectB.getInfo();
        objectB.MakePropose();
        System.out.println("--------------------------------------------------");

        objectC.getInfo();
        objectC.MakePropose();
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");



        try {
            objectC = objectB.clone();
            objectC.setOwner("ОсОО Рич");
            objectC.display();
        } catch (CloneNotSupportedException e) {

        }



    }
}
