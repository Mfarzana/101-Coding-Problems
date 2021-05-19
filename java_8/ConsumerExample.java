/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_problems.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Farzana
 */
/*
Consumer is a functional interface; it takes an argument and returns nothing.

@FunctionalInterface
public interface Consumer<T> {
  void accept(T t);
}
*/
public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> print = x -> System.out.println(x);
        print.accept("java");   // java

        
        
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // implementation of the Consumer's accept methods.
        Consumer<Integer> consumer = (Integer x) -> System.out.println(x);
        forEach(list, consumer);

        // or call this directly
        forEach(list, (Integer x) -> System.out.println(x));

    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    }

