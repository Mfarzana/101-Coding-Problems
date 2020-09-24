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
public class MergeSort {
    
    public static void main (String args[]){
    
        int a[]={3, 1, 20, 5, 30, 2};
       
        int b[]=new int[a.length];
        System.out.println("Before Sort "+Arrays.toString(a));
        MSort ms=new MSort();
        ms.merge_sort(a,0,a.length-1);
        System.out.println("Before Sort "+Arrays.toString(a));    
        
    }
}
class MSort{ 
    public  void merge_sort(int a[],int start, int end){
        if(start<end){
            int mid=(start+end)/2;
            merge_sort(a, start, mid); // sort left side
            merge_sort(a, mid+1, end); // sort Right side            
            merge(a, start, mid, start);// merge both left and right sides            
        }
        
    }
    public void merge(int arr[], int start, int mid, int end){
   }

    
}

