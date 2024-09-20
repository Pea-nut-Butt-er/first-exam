package model;

public class Product {
    private String name;
    private Integer stock;
    private Double price;

    private Tipo tipo;

    public Product() {
    }

    public Product(String name, Integer stock, Double price, Tipo tipo) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    //punto 2
    @Override
    public String toString(){
        return "Name: " + name + ", Stock: " + stock + ", Price: " + price + ", Tipo: <<" + tipo + ">>";
    }
}
