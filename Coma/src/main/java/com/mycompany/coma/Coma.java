package com.mycompany.coma;
import java.util.Scanner;
public class Coma {
    public static void main(String[] args) {
       String s ;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the String : ");
       s = input.nextLine() ;
        System.out.println(s.replace(",", ""));
       
    }
}