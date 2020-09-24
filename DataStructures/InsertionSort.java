/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort_algorithms;

import java.util.Arrays;

/**
 *
 * @author Farzana
 */
/*
Time Complexity: O(n*2) worst case

Auxiliary Space: O(1)

Before Insertion Sort [3, 1, 20, 5, 30, 2]
[3, 3, 20, 5, 30, 2] temp=1
[1, 3, 20, 20, 30, 2] temp=5
[1, 3, 5, 20, 30, 30] temp=2
[1, 3, 5, 20, 20, 30]
[1, 3, 5, 5, 20, 30]
[1, 3, 3, 5, 20, 30]
After Insertion Sort [1, 2, 3, 5, 20, 30]
*/
public class InsertionSort {
    public static void main(String args[]){
    
        int a[]={3, 1, 20, 5, 30, 2};
        System.out.println("Before Insertion Sort "+Arrays.toString(a));
        int temp=0;
        for(int i=1;i<a.length;i++){
            temp=a[i];
            int j=i-1;
            //free memory for small item
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];               
                j=j-1;
              System.out.println(Arrays.toString(a));

            }
           a[j+1]=temp;

        }
       System.out.println("After Insertion Sort "+Arrays.toString(a));

        
        
    }
}
