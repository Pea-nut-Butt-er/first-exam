package model;

public class Desktop extends Furniture{
    private Double height;
    private Double width;

    public Desktop() {
    }

    public Desktop(String name, Integer stock, Double price, Double height, Double width, Tipo tipo) {
        super(name, stock, price, tipo);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString(){
        return super.toString() + ", Height: " + height + ", Width" + width;
    }
}
