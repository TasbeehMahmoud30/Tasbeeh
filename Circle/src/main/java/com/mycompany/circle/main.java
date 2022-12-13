
package com.mycompany.circle;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Scanner inp = new Scanner(System.in);
        double r = inp.nextInt();
        System.out.println("area of circle is: "+obj1.area(r));
        Slynder obj2 = new Slynder();
        double h = inp.nextInt();
        System.out.println("volume of slynder is: "+obj2.volume(h));
    }
}
