package com.mycompany.myonlineshop2;
public interface Book {
    String name = "Hamlet";
    String publishyear = "1601";
    String authorname = "William Shakespeare";
    String booktype = "tragedy";

    public void setName(String name);

    public void setPublishyear(String publishyear);

    public void setAuthorname(String authorname) ;

    public void setBooktype(String booktype);

    public String getName();

    public String getPublishyear();

    public String getAuthorname();

    public String getBooktype();

    public double getPrice() ;
    
}
