package model;

public class Furniture extends Product{

    public Furniture() {
    }

    public Furniture(String name, Integer stock, Double price, Tipo tipo) {
        super(name, stock, price, tipo);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}