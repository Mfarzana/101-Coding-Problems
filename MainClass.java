/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;

/**
 *
 * @author Besty
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(".................................");
        SubClass obj=new SubClass();
        
        
        
        PyramidClass pobj=new PyramidClass();
        //pobj.getPyramidStar();
        //pobj.getReversePyramidNumber();
        //pobj.getPyramidNumberSeq(5, 1);
        //pobj.getInvertTriangle(5);
       // pobj.getBinaryTriangle(5);
       
        
        int A[] ={1,2,3,6};

        ArrayProblems p=new ArrayProblems();
        int val=p.getMissingNumer(A);
                //  int val=p.getBinarySearchValue(A,2);
       System.out.println(" indext "+val);
       // for(int i=1;i<=7;i++){
            // result=pobj.getTrinagle(i);
            // System.out.print(" "+result);

       // }
       
      /* StringProblems stringProblems=new StringProblems();
       String s= stringProblems.longestPalindrome("thequickbrownfoxxofnworbquickthe");
       System.out.println(" "+s);*/
      
      MathProblems m=new MathProblems();
      m.Decimal2Binary(12);

    }
    
}
