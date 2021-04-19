/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.java_base;

import java.util.Objects;

/**
 *
 * @author Farzana
 */

/* ## hashcode() method returns a hash code value as an integer for the object.
 equals() and hashCode() contract:
1) Two unequal objects may return the same hashcode.
2) When two objects are equal by equals(), they must have the same hashcode.
So in simple terms, the contract is that if obj1.equals(obj2) then obj1.hashCode() == obj2.hashCode()
Read more: https://www.java67.com/2013/06/how-get-method-of-hashmap-or-hashtable-works-internally.html#ixzz6pQ2iQgcM

*/

public class HashCodeExample {
            private String string;
            private int id;

            public HashCodeExample(String string, int id) {
               this.string = string;
               this.id = id;
            }

            @Override
            public boolean equals(Object o) {
               if (this == o)
                  return true;
               if (o == null || getClass() != o.getClass())
                  return false;
               HashCodeExample that = (HashCodeExample) o;
               return id == that.id && Objects.equals(string, that.string);
            }

            @Override
            public int hashCode() {
               return Objects.hash(string, id);
            }

             @Override
             public String toString() {
                 return "HashCodeExample{" + "string=" + string + ", id=" + id + '}';
             }   
}

//Test class
class Test
{
   public static void main (String[] args)
   {

      //Objects of HashCodeExample class.
      HashCodeExample example1 = new HashCodeExample("abc123", 1);
      HashCodeExample example2 = new HashCodeExample("abc123", 1);
        HashCodeExample example3 = new HashCodeExample("abc12443", 2);

        
         System.out.println(" ."+example1.toString()+" hascode "+example1.hashCode()+" equals "+example1.equals(example2));
           System.out.println(" ."+example2.toString()+" hascode "+example2.hashCode()+" equals "+example2.equals(example3));
           System.out.println(" ."+example3.toString()+" hascode "+example3.hashCode()+" equals "+example3.equals(example1));
     
   }
}
