package com.company;

  class Storage {
     private int came; //прийшло
     private int capacity; //вміщає
     private int retorn; // на повернення
     private int s;

     Storage(int came, int capacity, int retorn){
          super();
          this.retorn = retorn;
          this.came = came;
          this.capacity = capacity;
     }
     void greeting(){
         System.out.println("Вітаю вас у ношому книжковому магазині");
     }
     void greeting1(){
         greeting();
         System.out.println("YakaBook");
     }
     private void info(){
          System.out.println("У міщає склад: " +capacity);
          System.out.println("Прийшло товару: " +came);
          System.out.println("Відправлено на повернення: "+retorn);
     }
     void infoDemo(){
         info();
     }
     private int retor(){
          s = came - retorn;
          return s;
     }
     int retorDemo(){
         return retor();
     }

      private int remainder(){
          int d;
          d = capacity - s;
          return d;
     }
     int remainderDemo(){
         return remainder();
     }
      private  static void  discount(){
          System.out.println("Знижка");
     }
     void discountDemo(){
         discount();
     }

     public int getCame() {
          return came;
     }

     public void setCame(int came) {
          this.came = came;
     }

     public int getCapacity() {
          return 2*capacity;
     }

     public void setCapacity(int capacity) {
          this.capacity = capacity;
     }

     public int getRetorn() {
          return retorn;
     }

     public void setRetorn(int retorn) {
          this.retorn = retorn;
     }

     public int getS() {
          return s;
     }

     public void setS(int s) {
          this.s = s;
     }
}
