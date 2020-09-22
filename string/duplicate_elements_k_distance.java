/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101.coding.problems;

import java.util.HashMap;

/**
 *
 * @author Farzana
 */
public class duplicate_elements_k_distance {
    public static void main(String args[]){
    
        int k = 5;
        int arr[] = {10, 5, 3, 4, 3, 5, 6}; 
        System.out.println(" found "+hasDuplicate(arr,k));
        
    }
    public static boolean hasDuplicate(int [] arr, int k){
        HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
        
	for (int i = 0; i < arr.length; i++){
            if(hm.containsKey(arr[i])){
               if(i-hm.get(arr[i])<=k)
                  return true;               
            }
            hm.put(arr[i],i);
            System.out.println(" ..."+hm.toString());

        }
        
        return false;


    }
}
