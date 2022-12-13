package com.mycompany.array;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        n = input.nextInt();
        double arr[] = new double[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0 ; i<n ; i++){
        arr[i]= input.nextInt();
        }
        double max = arr[0] ;
        for (double num: arr){
            if (num > max )
                max = num ;
        }
        System.out.println("the largest elements of array is : " + max);
  
    }
}
