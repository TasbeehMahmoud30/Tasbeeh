package com.mycompany.myonlineshop;

public abstract class Product {
    String type ;
    String Manufacturercountry ;
    double price ;
    int units;

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
    
     public void setUnits(int units) {
        this.units = units;
    }
     
    public int getUnits() {
        return units;
    }
    
     public double TotalPrice(){
        return units*price;
    }

    public abstract double getPrice() ;
    
    
    
            
    
  
}
