package com.mycompany.circle;
import java.util.Scanner;

public class Slynder extends Circle
{
    
    double volume(double height)
    {
        Scanner inp = new Scanner(System.in);
        double r = inp.nextInt();
        double volume=area(r)*height;
        return volume;
    }
}
