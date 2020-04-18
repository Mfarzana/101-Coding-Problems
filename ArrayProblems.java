/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Farzana
 */
public class ArrayProblems {
   
    //B
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
    
    public int getMissingNo(int A[]){
    
        int result=0;
        for(int i=0;i<A.length-1;i++){
            result=A[i+1]-A[i];
            if(result>1) return A[i]+1;
        }
    return result;
    }
    
    public int getSecondMaxVal(int A[]){
    int max=A[0], smax=0;
    for(int i=1;i<A.length;i++){        
            if(max<A[i]){            
                smax=max;
                max=A[i];
         }
    }
    
    return smax;
    }
    
    public int getSecondMinVal(int A[]){
    int min=A[0], smin=0;
    for(int i=1;i<A.length;i++){        
          if(min>A[i]){            
                smin=min;
                min=A[i];
         }
         if(A[i]>min && A[i]<smin)smin=A[i];
    }
    
    return smin;
    }
    
    public int getMissingNumer(int arr[]){
        int sum = 0;
        int idx = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                 idx = i; 
            }
            else 
            {
                 sum += arr[i];
            }
        }

        // the total sum of numbers between 1 and arr.length.
        int total = (arr.length + 1) * arr.length / 2;

        return total - sum;  
    }
}
