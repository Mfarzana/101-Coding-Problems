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
public class sub_array_sum {
        public static void main(String args[]){
             int arr[] ={ 2, 3, 4, 1, 5 };
             int k=2; 
             System.out.println(" found "+findMaxSumSubArray(k,arr));

        }        
           public static int findMaxSumSubArray(int k, int[] arr) {
            // TODO: Write your code here
            int sum=0,maxsum=0;
            for(int i=0;i<arr.length-k;i++){
                sum=0;
                for(int j=i;j<i+k;j++){
                    sum+=arr[j];
                }
                maxsum=Math.max(maxsum, sum);
            }
            return maxsum;
        }
 
}
