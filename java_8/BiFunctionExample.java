/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_problems.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 *
 * @author Farzana
 */
/*
@FunctionalInterface
public interface BiFunction<T, U, R> {

      R apply(T t, U u);

}
T – Type of the first argument to the function.
U – Type of the second argument to the function.
R – Type of the result of the function.
*/
public class BiFunctionExample {
    public static void main(String args[]){
    BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;

    Integer result = func.apply(2, 3);
    System.out.println(result); // 5
    
    BiFunction<Integer, Integer,Integer> div=(x1,x2)->x1/x2;
    result=div.apply(10, 2); // 5
    System.out.println(result); // 5
    
    BiFunction<Integer, Integer,List<Integer>> listdiv=(x1,x2)->Arrays.asList(x1/x2);
    List<Integer> list=listdiv.apply(10, 2); // 5
    System.out.println(list); // 5
    
    }
}
