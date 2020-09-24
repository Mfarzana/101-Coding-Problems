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
Before Sort [3, 1, 20, 5, 30, 2]
Partition Sort [1, 3, 20, 5, 30, 2]
Partition Sort [1, 2, 20, 5, 30, 3]
Partition Sort [1, 2, 3, 5, 30, 20]
After Sort [1, 2, 3, 5, 20, 30]
*/
public class QuickShort {
    public static void main(String agrs[]){
    
        int a[]={3, 1, 20, 5, 30, 2};       
        System.out.println("Before Sort "+Arrays.toString(a));
        
        quickShort(a,0,a.length-1);
        System.out.println("After Sort "+Arrays.toString(a));    
    }
    public static void quickShort(int a[],int low,int high){    
        if(low>=high) return;
        
        int p=partition(a,low,high);
        quickShort(a, low, p-1); //left side
        quickShort(a, p+1, high); //right side
        
    }
    public static int partition(int a[],int low,int high){
     int i = low-1; // i
     int j=0;
     int pivot=a[high];
     int temp=0;
     
     for(j=low;j<high;j++){
         if(a[j]<pivot){
             i++;
             temp=a[j];
             a[j]=a[i];
             a[i]=temp;
         }
     }
     
    System.out.println("Partition Sort "+Arrays.toString(a));    

     temp=pivot;//
     a[j]=a[i+1];
     a[i+1]=pivot;
     

    return i+1;
    }
}
