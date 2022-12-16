package com.company;
class Shop implements EmergencySituations {
    private int comics; //комікс
    private int book; //книжка
    private int magazine; //журнал

    Shop(int comics, int book, int magazine) {
        super();
        this.magazine = magazine;
        this.comics = comics;
        this.book = book;
    }
    double priceAll(PayOffice o){
        return (comics+book+magazine)*o.getPrice();
    }

     void discount(){
        System.out.println("Знижка з бонусною картою");
    }

    void number() {
        System.out.println("Кількість книжок: " + book);
        System.out.println("Кількість журналів: " + magazine);
        System.out.println("Кількість коміксів: " + comics);
    }

    int cum() {
        int a;
        a = magazine + comics + book;
        return a;
    }
    @Override
    public void emergency() {
        System.out.println("Оголошеня");
        System.out.println("Заберіть авто з службового місця");
    }
    public int getComics() {
        return comics;
    }

    public void setComics(int comics) {
        this.comics = comics;
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public int getMagazine() {
        return magazine;
    }

    public void setMagazine(int magazine) {
        this.magazine = magazine;
    }

}


