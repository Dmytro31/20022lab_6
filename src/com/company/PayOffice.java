package com.company;

class PayOffice implements EmergencySituations {
    private double profit; //заробіток
    private double costs;  //Витрати
    private double salary;  //зп
    private double price = 123.3;

    PayOffice(int profit, int salary, int costs){
        this.salary = salary;
        this.profit = profit;
        this.costs = costs;
    }
    int zp(int profit, int costs , int salary){
        int c = costs+salary;
        return profit-c;
    }
    void info(){
        System.out.println("Заробіто за місяць: " +profit);
        System.out.println("Витрати на замовлення: " +costs);
        System.out.println("Заробітна плата: " +salary);
    }
    @Override
    public void emergency() {
        System.out.println("Загубили гаманець прохання підійти до каси забрати");
    }

    double zp(){
        double c = costs+salary;
        return profit-c;
    }
    static void discount(){
        System.out.println("Знижка за замовлиня");
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(double costs) {
        this.costs = costs;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
