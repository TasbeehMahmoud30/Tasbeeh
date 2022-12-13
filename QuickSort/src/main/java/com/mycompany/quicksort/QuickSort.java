package com.mycompany.quicksort;
import java.util.Scanner;
public class QuickSort {
    public static void QuickSort (int[]arr , int l , int r){
        if ( l < r ){
            int q = position( arr , l , r );
            QuickSort( arr , l , q-1);
            QuickSort( arr , q+1 , r);
        }
    }
    private static int position (int[]arr , int l , int r){
        int i = l - 1 ;
        for (int j = l ; j < r ; j++){
            if (arr[j] < arr[r]){
                i++;
                swap( arr , i , j );
            }
        }    
        swap (arr , i + 1 , r);
        return i+1 ;
    }
    private static void swap ( int[]arr , int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
       int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int x=0 ; x<n ; x++){
        arr[x]= input.nextInt();
        }
        QuickSort (arr , 0 , n-1);
        System.out.println("the quick sort of array : ");
        for (int i = 0 ; i<n ; i++){
        System.out.println(arr[i]);
        }
        
    }
}
