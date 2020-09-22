/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Farzana
 */
public class InstanceMethodsReferenceArbitrary {
    public static void main(String args[]){
    
        List<Integer> integerList = new ArrayList<>();
        integerList.add(55);
        integerList.add(22);
        integerList.add(66);
        integerList.add(11);
        integerList.add(88);
        integerList.add(99);
        
        System.out.println(integerList);
        Collections.sort(integerList,Integer::compareTo);    
        System.out.println(integerList);

    
    }
}
