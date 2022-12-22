package com.mycompany.myonlineshop;

public class ChildrenBook extends Book {

    /**
     *
     * @return
     */
    @Override
    public double getPrice() {
        return price*2 ;
    }
    
}
