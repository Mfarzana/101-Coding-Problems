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
/*
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
*/
public class Max_Consecutive_Ones {
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
       
       
       // Maximum max consecutive  in a binary array

       
       int b[]={1,1,0,1,1,1,0,0,0,0};
        
        int sum = 0; //intitialize count 
        int max = 0; //initialize max          

         for(int i=0;i<b.length-1;i++){        
              
            if (b[i] != b[i+1]) 
                sum=0;      
           
            else
            { 
                sum++;//increase count 
                max = Math.max(sum, max); 
            } 
            
            System.out.println(b[i]+"  "+b[i+1]+" max "+max);

        }       
         if(max>1)max++;
                System.out.println(max+" max ");

    }
}
