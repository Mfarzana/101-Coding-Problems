/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101.coding.problems;

import java.util.Arrays;

/**
 *
 * @author Farzana
 */
public class bubble_sort_algorithm {
    
     public static void main(String args[]){
        int a[]={3, 1, 20, 5, 30};
        int temp=0;
               
         for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("System ..."+Arrays.toString(a));
        
     }
}
