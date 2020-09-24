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

//Selection sort: finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning // min to max
//Time complexity=O(n*n)
/*
arr[] = 64 25 12 22 11  // find min first and swap first element then 2nd min and swap 2nd element and so on
11 25 12 22 64  - step-1
11 12 25 22 64  - step-2
11 12 22 25 64  - step-3
11 12 22 25 64  - step-4

output:
[3, 1, 20, 5, 30, 2]
[1, 3, 20, 5, 30, 2] step-1
[1, 2, 20, 5, 30, 3] step-2
[1, 2, 3, 5, 30, 20] step-3
[1, 2, 3, 5, 20, 30] step-4
*/
public class SelectionSort {
    public static void main(String args[]){

        int a[]={3, 1, 20, 5, 30,2};
        System.out.println("Before Sort "+Arrays.toString(a));
        int min_index=0,temp=0;// step 1 : set min to location 0
        for(int i=0;i<a.length;i++){
            min_index=i;
            
            // step 2: search the minimum element in the list
            for(int j=i+1;j<a.length;j++){
             if(a[min_index]>a[j])
                 min_index=j;
            }
            
            //step 3: swap with minimum value at min location
            if(min_index!=i){
                temp=a[i];
                a[i]=a[min_index];
                a[min_index]=temp;
                       System.out.println(Arrays.toString(a));

            }
            
           //step 4 repeat until
        }//end for loop
       System.out.println("Before Sort "+Arrays.toString(a));
        
      }
}
