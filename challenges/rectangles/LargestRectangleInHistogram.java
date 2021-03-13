/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.challenges.rectangles;

/**
 *
 * @author Farzana
 */
/*
Problem
https://afteracademy.com/blog/largest-rectangle-in-a-histogram
https://www.geeksforgeeks.org/largest-rectangle-under-histogram/
*/
/*
## Understanding the Problem:
You are given an array of integers arr where each element represents the height of a bar in a histogram. 
A Histogram is a graphical display of data using bars of different heights. 
The bars are placed in the exact same sequence as given in the array. 
You need to find the area of the largest rectangle found in the given histogram.

###  Possible Solutions
1) Solution I — Brute Force
2) Solution II — Using Divide & Conquer
3) Solution III — Using Stack
*/
public class LargestRectangleInHistogram {    
    //## 1) Solution I — Brute Force   //brute force, O(n^2)
    public static int  getMaxAreaByBruteForceSolution(int arr[]){
            int maxArea=0;
            int minHeight=0;
            for(int i=0;i<arr.length; i++){
                minHeight=arr[i];
                for(int j=i+1 ; j<arr.length; j++){
                        minHeight=Math.min(minHeight, arr[j]);
                        maxArea=Math.max(maxArea, minHeight*(j-i+1));
                }
            }
            
        return maxArea;
    }
            
    public static void main(String[] args) { 
        int histogramBars[] = { 6, 2, 5, 7, 5, 1, 6 }; 
        System.out.println("Maximum area is " + getMaxAreaByBruteForceSolution(histogramBars)); 
    } 
}
