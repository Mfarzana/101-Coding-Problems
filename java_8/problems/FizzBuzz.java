/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_8.problems;
import java.util.*;
/**
 *
 * @author Farzana
 */
/*
Problem : For a given natural number greater than zero return:
    “Fizz” if the number is dividable by 3
    “Buzz” if the number is dividable by 5
    “FizzBuzz” if the number is dividable by 15
    the same number if number is neither divisible by 3 nor 5
*/
public class FizzBuzz {
        
    public static void main(String args[]){
    
    System.out.print(fizzBuzzSolution(15));
    System.out.print("    "+fizzBuzzSolution2(5));

    
    }
    public static String fizzBuzzSolution(int num){
       
        return  Optional.of(num).map((n)->{
                if (n % (3 * 5) == 0) 
                { return "FizzBuzz"; } 
                else if (n%5==0) {return "Buzz";}
                else if (n%3==0){ return "Fizz";}
                else { return Integer.toString(n);}
            }).get();
        
        
    }
   //Or
    public static String fizzBuzzSolution2(int num){
        String result=Optional.of(num).map(n->(n%3==0?"Fizz":"")+(n%5==0?"Buzz":"")).get();
        return result.isEmpty()?Integer.toString(num):result;
    }

}

/*
 //else if(n%5==0) return "Buzz";
                   // else if(n%3==0)return "Fizz";
                    else {return Integer.toString(num);}
*/