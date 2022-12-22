package com.mycompany.myonlineshop2;
public abstract class Product {
     String type ;
    String Manufacturercountry ;
    double price ;

    public Product() {
    }

    public Product(String type, String Manufacturercountry, double price) {
        this.type = type;
        this.Manufacturercountry = Manufacturercountry;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setManufacturercountry(String Manufacturercountry) {
        this.Manufacturercountry = Manufacturercountry;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getManufacturercountry() {
        return Manufacturercountry;
    }

    public abstract double getPrice() ;
    
    
}
