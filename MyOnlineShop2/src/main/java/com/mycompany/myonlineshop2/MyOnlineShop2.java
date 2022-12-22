package com.mycompany.myonlineshop2;
public class MyOnlineShop2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of books : ");
        int x = input.nextInt();
        CartoonBook[] arr = new CartoonBook[x]; 
        CartoonBook b = new CartoonBook();
        double Totalprice =0;
        for(int i=0 ; i<x ; i++){
             System.out.print("Enter the price of CartoonBook : ");   
             double price = input.nextInt();
             b.setPrice(price) ;
              arr[i]= b;
             Totalprice=Totalprice + price;
        System.out.println("The array : " + arr[i].price);
        }
        System.out.println("The total price of books is : " + Totalprice);
 
    }
}
