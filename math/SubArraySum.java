/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.math;

/**
 *
 * @author Farzana
 */
public class SubArraySum {
    
    public static void main(String args[]){
         int a[] =new int[]{-2,1,-3,4,-1,2,1,-5,4};
         int currMax=a[0];
         int max=a[0];
         for(int i:a){
             currMax=Math.max(i,i+currMax);
             max=Math.max(currMax, max);
         }
         
         System.out.println(" "+max);
         
    }
}
