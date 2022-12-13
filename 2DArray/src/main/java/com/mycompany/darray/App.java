/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.darray;

/**
 *
 * @author Options
 */

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = input.nextInt();
        int[][] originalMatrix = new int[rows][cols];
        int[][] transposeMatrix = new int[cols][rows];
        System.out.print("Enter the data for matrix : ");
        for (int i = 0; i < rows ; i++){
            for (int j = 0; j < cols ; j++) 
                originalMatrix[i][j] = input.nextInt();
        } 
       
         System.out.print("build the transpose matrix : ");
         for (int i = 0; i < rows ; i++){
            for (int j = 0; j < cols ; j++) 
                transposeMatrix[j][i] = originalMatrix[i][j] ;
        } 
        System.out.println("Transpose matrix:" );  
         for(int i = 0 ; i < rows ; i++)      //Print the transpose matrix
        {
             for(int j = 0 ; j < cols ;j++)
             {
                 System.out.print(transposeMatrix[i][j]+" ");
             }
            System.out.println("");
        }
  
    }
    
}
