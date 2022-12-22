package com.mycompany.myonlineshop;

import java.util.Scanner;

public class MyOnlineShop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of books : ");
        int x = input.nextInt();
        Product[] arr = new Book[x]; 
        Product b = new Book();
        double Totalprice =0;
        for(int i=0 ; i<x ; i++){
             System.out.print("Enter the price of book : ");   
             double price = input.nextInt();
             b.setPrice(price) ;
              arr[i]= b;
             Totalprice=Totalprice + price;
        System.out.println("The array : " + arr[i].price);
        }
        //System.out.println("The array : " + arr[i].price);
        System.out.println("The total price of books is : " + Totalprice);
    } 
}
