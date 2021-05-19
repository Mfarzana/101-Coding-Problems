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
 Given a positive integer num, write a function which returns True if num is a perfect square else False. 
    Note: Do not use any built-in library function such as sqrt. 
         Example 1: 
         Input: 16 
         Returns: True
1>  false, 14> false
*/
public class PerfectSquare {
    
    public static boolean  isPerfectSqare(int val){
        int i=1;  boolean result=false;
        while(i<=val/2){
            if(i*i>val) break;
            else if(i*i==val){
                result=true;
                break;
            }
            i++;
        }
        return result;
    }
    
    public static void main(String args[]){
        System.out.println("isPerfectSqare(1)  "+isPerfectSqare(1));
        System.out.println("isPerfectSqare(16)  "+isPerfectSqare(16));
        System.out.println("isPerfectSqare(15)  "+isPerfectSqare(15));
    }
}
