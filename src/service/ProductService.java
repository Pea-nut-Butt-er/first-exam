package service;

import model.*;

public class ProductService {
    public Double changePrice(Product p){
        Double resultado = 0.0;

        if(p instanceof Chair){
            resultado = p.getPrice() * 1.05;
        } else if (p instanceof Desktop) {
            resultado = p.getPrice() * 1.1;
        } else if (p instanceof Printer) {
            resultado = p.getPrice() * 1.15;
        } else if (p instanceof NoteBook) {
            resultado = p.getPrice() * 1.20;
        }else{
            resultado = p.getPrice();
        }
        return resultado;
    }
}
