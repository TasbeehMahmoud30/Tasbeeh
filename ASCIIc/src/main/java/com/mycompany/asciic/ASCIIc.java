package com.mycompany.asciic;
import java.util.Scanner;
public class ASCIIc {

    public static void main(String[] args) {
        char ch ; int as ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ascii value: ");
        as = input.nextInt();
        ch = (char)as ;
        System.out.println("The character is " + ch);
    }
}
