package com.company;

public class Main {

    public static void main(String[] args) {

        VegeteType objectA = new VegeteType("С/Х Путь", "груши", 30000,
                TypeDelivery.SCLAD_TO_MARKET);



        Apple objectB = new Apple("ОсОО Рич", "яблоки",
                "Голден", 800000,
                TypeDelivery.SCLAD_TO_FOREGN_BORDER,"БалыкчиБаза","Чуйская 12" );




        Apple objectC = new Apple("ч/п Байгожоев", "яблоки","Превосход",600000,
                TypeDelivery.SCLAD_TO_AVTO,"ТюпБаза","Ленинская 82");


        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());

    }




}
