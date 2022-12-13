package com.mycompany.area;
import java.util.Scanner;
public class Area {
  
   public static void main(String[] args) {

    Triangle t = new Triangle();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter base of the Triangle: ");
    double n = input.nextInt();
    System.out.println("Enter height of the Triangle: ");
    double m = input.nextInt();
    System.out.println("Enter side 1 of the Triangle: ");
    double x = input.nextInt();
    System.out.println("Enter side 2 of the Triangle: ");
    double y = input.nextInt();
    System.out.println("The area of Trianle is " + t.area(n,m));
    System.out.println("The circumference of Trianle is " + t.circumference(n,x,y));
    Circle c = new Circle();   
    System.out.println("Enter radius of the Circle: ");
    double i = input.nextInt();
    System.out.println("The area of Circle is " + c.area( i ));
    System.out.println("The circumference of Circle is " + c.circumference( i ));
       
   }
}

