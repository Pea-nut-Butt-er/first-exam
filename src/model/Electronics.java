package model;

public class Electronics extends Product{
    private String developer;

    public Electronics() {
    }

    public Electronics(String name, Integer stock, Double price, String developer, Tipo tipo ) {
        super(name, stock, price, tipo);
        this.developer = developer;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @Override
    public String toString(){
        return super.toString() + ", Developer: " + developer;
    }
}
