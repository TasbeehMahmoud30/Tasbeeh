package com.mycompany.myonlineshop2;
public class CartoonBook extends Product implements Book {
    String name ;
    String publishyear ;
    String authorname ;
    String booktype ;

    public CartoonBook() {
    }

    public CartoonBook(String name, String publishyear, String authorname, String booktype, String type, String Manufacturercountry, double price) {
        super(type, Manufacturercountry, price);
        this.name = name;
        this.publishyear = publishyear;
        this.authorname = authorname;
        this.booktype = booktype;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getPublishyear() {
        return publishyear;
    }
    @Override
    public void setPublishyear(String publishyear) {
        this.publishyear = publishyear;
    }
    @Override
    public String getAuthorname() {
        return authorname;
    }
    @Override
    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }
    @Override
    public String getBooktype() {
        return booktype;
    }
    @Override
    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }
    @Override
    public double getPrice() {
        return price*2 ;
    }
    
}
