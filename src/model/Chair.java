package model;

import interfaces.Discount;

public class Chair extends Furniture implements Discount {
    private Boolean hasWheels;

    public Chair() {
    }

    public Chair(String name, Integer stock, Double price, Boolean hasWheels, Tipo tipo) {
        super(name, stock, price, tipo);
        this.hasWheels = hasWheels;
    }

    public Boolean getHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(Boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    @Override
    public String toString(){
        return super.toString() + ", Has Wheels?: " + hasWheels;
    }
    @Override
    public Double discount(Double percentaje){
        return super.getPrice() / 100 * (100 - percentaje) ;
    }
}
