package com.company;

public class Comicss extends Shop {
    Comicss(int comics, int book, int magazine) {
        super(comics, book, magazine);
    }
    final int one(){
         int numbers = (int) (Math.random()*520);
        return numbers;
    }
    final int two(){
        int numbers1 = (int) (Math.random()*320);;
        return numbers1;
    }
    final void test(){
        int marvell = getComics();
        int tt = marvell - (one()+two());
        System.out.println("Інші комікси " +tt);
    }
}
