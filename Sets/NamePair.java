/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sets;

/**
 *
 * @author Farzana
 */
import java.util.*;

class Pair {
    public String name1;
    public String name2;
    
    Pair(String name1, String name2) {
       this.name1 = name1;
       this.name2 = name2;
    }   
         
    @Override
    public boolean equals(Object o){  
        if(this == o) return true;
        Pair pair = (Pair) o;
        if(name1.equals(pair.name1) && name2.equals(pair.name2)) return true;
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name1,name2);
   }

    @Override
    public String toString() {
        return "Pair{" + "name1=" + name1 + ", name2=" + name2 + '}';
    }
    
}

public class NamePair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Pair> set = new HashSet<Pair>();
        System.out.println("set input size :");
       // int T = scanner.nextInt();
        //
       //System.out.println("Enter pair name");

      /*  for(int i = 0; i < T; i++) {
            set.add(new Pair(scanner.next(), scanner.next()));           
        }*/
      // Objects are unique
        set.add(new Pair("tom", "tom"));   
        set.add(new Pair("tom", "jerry")); 
        set.add(new Pair("tom", "tom"));   //
         System.out.println(set);
    }
}
