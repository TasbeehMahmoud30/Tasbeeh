package com.mycompany.mycircle;

import java.util.Scanner;

public class MyCircle {

    public static void main(String[] args) {
   Circle c = new Circle(1.0 , "Red");
     System.out.println( "THE CIRCLE COLOR :"+c.getColor());
     System.out.println( "THE CIRCLE RADUIS :"+c.getRadius());
     System.out.println("THE CIRCLE AREA :"+c.getArea());
   
   Cylinder x = new Cylinder(1.0,1.0,"Yellow");
     System.out.println( "THE Cylinder COLOR :"+x.getColor());
     System.out.println( "THE Cylinder RADUIS :"+x.getRadius());
     System.out.println("THE Cylinder AREA :"+x.getArea());

        System.out.println( "ENTER THE CIRCLE COLOR :");
        Scanner in = new Scanner(System.in);
        String color = in.nextLine();
        c.setColor(color);
        
        System.out.println( "ENTER THE Cylinder COLOR :");
        String co = in.nextLine();
        x.setColor(co);
        
        System.out.println( "ENTER THE CIRCLE RADUIS :");
        double raduis = in.nextDouble();
        c.setRadius(raduis);
        
        System.out.println( "ENTER THE Cylinder RADUIS :");
        double r = in.nextDouble();
        x.setRadius(r);
        
        System.out.println( "ENTER THE Cylinder Height :");
        double h = in.nextDouble();
        x.setHeight(h);
        
       System.out.println( "THE CIRCLE INFORMATION :");
        System.out.println( "THE CIRCLE AREA :"+c.getArea());
        System.out.println( c.toString());

       System.out.println( "THE Cylinder INFORMATION :");
        System.out.println( "THE Cylinder COLOR :"+x.getColor());
        System.out.println( "THE Cylinder AREA :"+x.getArea());
        System.out.println( x.toString());
   
   

    }
}
