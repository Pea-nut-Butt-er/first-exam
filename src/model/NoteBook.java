package model;

public class NoteBook extends Electronics{
    private Double storageSpaceGb;

    public NoteBook() {
    }

    public NoteBook(String name, Integer stock, Double price, String developer, Double storageSpaceGb, Tipo tipo) {
        super(name, stock, price, developer, tipo);
        this.storageSpaceGb = storageSpaceGb;
    }

    public Double getStorageSpaceGb() {
        return storageSpaceGb;
    }

    public void setStorageSpaceGb(Double storageSpaceGb) {
        this.storageSpaceGb = storageSpaceGb;
    }

    @Override
    public String toString(){
        return super.toString() + ", Storage Space: " + storageSpaceGb + "GB";
    }
}
