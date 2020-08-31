/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author Farzana
 */
// Array must be accending order
//time complexity log2^n 
//16 is the array size;
//Binary search:-log2^16 only need to comapare 4 times but linear search 16 times

public class BinarySearch {
   public int getBinarySearchValue(int A[],int number){
        
        int l=0,len=A.length-1;
        while(l<=len){
             int m=l+(len-1)/2; 
             if(A[m]==number) return m;
             else if(number>A[m]) l=m+1;
             else len=m-1;
         }
        return -1;
    }
    
    public int getBinarySearchRecursive(int A[],int l,int len, int x){

                
        if (len >= l) { 
            int m = l + (len - l) / 2;             
            if (A[m] == x) return m;   
            if (A[m] > x) return getBinarySearchRecursive(A, l, m - 1, x);             
            return getBinarySearchRecursive(A, m + 1, len, x); 
        }           
        return -1; 
    }
}