package com.company;

public class Dispatching {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public void dispatching(){
        Shop sp = new Shop(1003, 553, 223);
        PayOffice po = new PayOffice(457668, 15000, 7000);
        Storage sg = new Storage(250, 500, 16);
        Comicss cs =new Comicss(1003,553,223);
        Marvel ml = new Marvel(1003,553,223);
        DC d = new DC(1003,553,223);
        BlackFriday bf = new BlackFriday();
        WinterDiscounts wd = new WinterDiscounts();
        sg.greeting1();
        wd.discounts();
        sp.emergency();
        po.emergency();
        System.out.println("Кількість товару в магазині: " +sp.cum());
        sp.number();
        System.out.println("" +sp.priceAll(po));
        d.test1();
        ml.test1();
        sp.discount();
        po.info();
        System.out.println(ANSI_GREEN+"________________________________________"+ANSI_RESET);
        System.out.println(               "Товарний склад"           );
        System.out.println("Збіліштня складу" +sg.getCapacity());
        sg.discountDemo();
        sg.infoDemo();
        System.out.println("Якісний товар: " +sg.retorDemo());
        System.out.println("Залишок місця на складі: " +sg.remainderDemo());
        System.out.println("________________________________________");
        po.discount();
        System.out.println("Чистий прибуток: " +po.zp(56767676,6456,5645));
        Person person = new Person();
        person.name = "Олег";
        person.surname = "Олегов";
        person.position = "Директор";
        System.out.println(person.position +" - "+person.name+ " "+person.surname);
        System.out.println(cs);
    }
}
