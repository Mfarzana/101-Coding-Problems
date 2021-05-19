/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.java_8;

import java.util.Arrays;

/**
 *
 * @author Farzana
 */
public class ParallelSort {
         public static void main(String[] args) {
	int numbers[] = {22, 89, 1, 32, 19, 5};
	//Parallel Sort method for sorting int array
        Arrays.parallelSort(numbers);
        //converting the array to stream and displaying using forEach
	Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
               
    }
}