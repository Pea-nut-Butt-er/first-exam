import model.*;
import service.ProductService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        //punto 1
        Product p = new Product("Coke", 70, 10.0, Tipo.PRODUCT);
        Furniture f = new Furniture("Table", 4, 1400.0, Tipo.FURNITURE);
        Chair c = new Chair("Oak", 24, 600.0, false, Tipo.CHAIR);
        Desktop d = new Desktop("BirchWood", 8, 1200.0, 70.0, 150.0, Tipo.DESKTOP);
        Electronics e = new Electronics("Chip", 115, 50.0, "LogiTech", Tipo.ELECTRONICS);
        Printer pr = new Printer("BlackWhite", 8, 2500.0, "EXO", 3, Tipo.PRINTER);
        NoteBook n = new NoteBook("TabletNoteBook", 15, 5000.0, "HP", 256.0, Tipo.NOTEBOOK);

        //punto 3
        ArrayList<Product> products = new ArrayList<>();

        products.add(p);
        products.add(f);
        products.add(c);
        products.add(d);
        products.add(e);
        products.add(pr);
        products.add(n);

        for(Product p1: products){
            System.out.println(p1.toString());
        }

        //punto 4
        System.out.println(); //salto de linea
        System.out.println("Con el descuento ahora vale: " + c.discount(15.0));


        //punto 5
        System.out.println("Precio desactualizado:");
        for(Product p2: products){
            System.out.println(p2.getTipo() + ": " + p2.getPrice());
        }

        System.out.println("Precio actualizado:");
        for(Product p3: products){
            System.out.println(p3.getTipo() + ": " + productService.changePrice(p3));
        }

    }
}