/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101.coding.problems;

/**
 *
 * @author Farzana
 */
public class Minimum_Distance_two_zero_Binary {
    public static void main(String args[]) {

        int a[]={1,1,0,1,1,1,1,0,0,0};
        
        int count = 0; //intitialize count 
        int result = 0; //initialize max  
        
        // Maximum consecutive one’s (or zeros) in a binary array

         for(int i=0;i<a.length;i++){        
              
            if (a[i] == 0) 
                count = 0;      
           
            else
            { 
                count++;//increase count 
                result = Math.max(result, count); 
            } 
        }       

       System.out.println(result+" max ");
    }
}
