package com.mycompany.myonlineshop;

public class Book extends Product {
    String name;
    String publishyear;
    String authorname;
    String booktype;

    public Book() {
    }

    public Book(String name, String publishyear, String authorname, String booktype, String type, String Manufacturercountry, double price,int units) {
        super(type, Manufacturercountry, price);
        this.name = name;
        this.publishyear = publishyear;
        this.authorname = authorname;
        this.booktype = booktype;
        this.units = units;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublishyear(String publishyear) {
        this.publishyear = publishyear;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getName() {
        return name;
    }

    public String getPublishyear() {
        return publishyear;
    }

    public String getAuthorname() {
        return authorname;
    }

    public String getBooktype() {
        return booktype;
    }
    /**
     *
     * @return
     */
    @Override
    public double getPrice() {
        return price*3 ;
    }
    
}
