/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101.coding.problems;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Farzana
 */

/* ............Iterate HashMap....................

If you're only interested in the keys, you can iterate through the keySet() of the map:

Map<String, Object> map = ...;

for (String key : map.keySet()) {
    // ...
}
If you only need the values, use values():

for (Object value : map.values()) {
    // ...
}
Finally, if you want both the key and value, use entrySet():

for (Map.Entry<String, Object> entry : map.entrySet()) {
    String key = entry.getKey();
    Object value = entry.getValue();
    // ...
}
*/
public class Count_occurrence_each_char {
         public static void main(String args[]){
             String x="this is a pen";
             HashMap<Character, Integer> ch_hp=new HashMap<Character, Integer>();             
             char [] charArray=x.toCharArray();
             
             for(char c:charArray){
                 if(ch_hp.containsKey(c))
                     ch_hp.put(c,ch_hp.get(c)+1);
                 else 
                     ch_hp.put(c,1);
                 
             }
             System.out.println("System ..."+ch_hp.toString());
         }

}
