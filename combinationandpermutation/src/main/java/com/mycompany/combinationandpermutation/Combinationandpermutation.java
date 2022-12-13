package com.mycompany.combinationandpermutation;
import java.util.Scanner;
public class Combinationandpermutation {
   int fact(int n) {
        if ( n == 1)
            return 1;
        return n*fact(n - 1);    
    }
    public static void main(String[] args) {
       int per , com , rr , nn ;
       Scanner input = new Scanner(System.in);
       nn = input.nextInt();
       rr = input.nextInt();
       Combinationandpermutation obj = new Combinationandpermutation() ;
     
                  if(nn==rr)
                  { System.out.println("The permutation is " + obj.fact(nn));
       System.out.println("The combination is " + 1);
                  }
       else
       {per = (obj.fact(nn)/ obj.fact(nn - rr) ); 
       com = per / obj.fact(rr);

           System.out.println("The permutation is " + per);
       System.out.println("The combination is " + com); }    
       
 
    }
}