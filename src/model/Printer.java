package model;

import interfaces.Discount;

public class Printer extends Electronics implements Discount {
    private Integer printPerMinute;

    public Printer() {
    }

    public Printer(String name, Integer stock, Double price, String developer, Integer printPerMinute, Tipo tipo) {
        super(name, stock, price, developer, tipo);
        this.printPerMinute = printPerMinute;
    }

    public Integer getPrintPerMinute() {
        return printPerMinute;
    }

    public void setPrintPerMinute(Integer printPerMinute) {
        this.printPerMinute = printPerMinute;
    }

    @Override
    public String toString(){
        return super.toString() + ", Prints per minute: " + printPerMinute + "/mn";
    }
    @Override
    public Double discount(Double percentaje){
        return super.getPrice() / 100 * (100 - percentaje) ;
    }
}
