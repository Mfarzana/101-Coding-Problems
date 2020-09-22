/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_base;

/**
 *
 * @author Farzana
 */
public class OverLoadingEXample {
    public int sum(int a, int b){
          System.out.println(a+b);
    return a+b;
    }
    public String  sum(int a, int b,int c){  
          System.out.println(a+b+c);
         return String.valueOf(a+b+c);
    }

    public OverLoadingEXample() {
    }
    public OverLoadingEXample(String s) {
        System.out.println(s);
    }
    
    public static void main(String[] args) {
       OverLoadingEXample eXample=new OverLoadingEXample("sdfslkdfjslkdf");
       eXample.sum(10, 10);
       eXample.sum(10, 10,30);

    }
    
}
