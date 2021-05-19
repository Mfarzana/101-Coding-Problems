/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.math;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Farzana
 */
public class SubArraySumTarget {
    public static void main(String args[]){
        int a[]=new int[]{2,7,11,15}; 
        int target=9;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
                    int sub=target-a[i];
                    if(map.containsKey(sub))
                        System.out.println(Arrays.toString(new int []{i,map.get(sub)}));
                    
                    map.put(a[i],i);
             }
    }
}
