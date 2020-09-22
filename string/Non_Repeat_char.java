/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101.coding.problems;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Farzana
 */
public class Non_Repeat_char {
         public static void main(String args[]){

             String str="Tanbir Hossain";
             HashMap<Character, Integer> chHM=new HashMap<Character,Integer>();
             
             char [] strArr=str.toCharArray();
             for(char c: strArr){
                 if(chHM.containsKey(c))
                     chHM.put(c,chHM.get(c)+1);
                 else 
                     chHM.put(c, 1);
             }
             
            System.out.println("......"+chHM.toString());

            ArrayList<Character> ch=new ArrayList();
            
            for (HashMap.Entry<Character, Integer> item : chHM.entrySet()) {
                char key = item.getKey();
                int value = item.getValue();          
            
                 if(value==1 && key!=' ')
                     ch.add(key);
             }
             
             System.out.println("......"+ch.toString());
         }
}
