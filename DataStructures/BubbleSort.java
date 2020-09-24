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
Starting from the first index, compare the first and the second elements.If the first element is greater than the second element, they are swapped.
Now, compare the second and the third elements. Swap them if they are not in order. 
The above process goes on until the last element.Example:
int[] arr={20,3,1,30,5}; // find max first
[3, 1, 20, 5, 30] step-1 n i=0
[1, 3, 5, 20, 30] steo-2 n-1 i=1 big one in the last
[1, 3, 5, 20, 30] strep n-3 i=2
[1, 3, 5, 20, 30]
[1, 3, 5, 20, 30]
Time complexity=O(n*n)
Space complexity=O(1) for constant variable
*/
public class BubbleSort {
    public static void main(String args[]){
        int a[]={3, 1, 20, 5, 30};
        System.out.println("Before Sort "+Arrays.toString(a));
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
        System.out.println("After Sorting "+Arrays.toString(a));
        
    }
}
