/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_8;
import java.util.*;
/**
 *
 * @author Farzana
 */
/*
		• Lambda expression is a function without any signature.
		• It doesn't have a name, return type, and modifiers.
		• It can have any number of arguments.
		• For one argument lambda expressions, parenthesis are optional.
		• Compiler can understand the data type.
                Curly braces are mandatory for many arguments.
*/
public class Lambda {
    
    // functional interface that has only one abstract method.
    interface MathOperation{
        int operation(int a, int b);        
    }
    
    //mehtod for code resuse for example 2
    private int executeOperation(int a,int b,MathOperation mathOperation){
            return mathOperation.operation(a, b);
   }
    public static void main(String args[]){
        //without lamand function

        MathOperation mathop=new MathOperation() {
            @Override
            public int operation(int a, int b) {
               return a+b;
            }
        };
        //with Lambda Expresion Example 1
        MathOperation addition=(a,b)->{ 
                                        int sum=a+b;
                                        System.out.print("sum="+sum);
                                        return sum;
                                       };   
        addition.operation(10,20);       

        // lambda example 2
        MathOperation multiplicatiion=(a,b)-> a+b;// single statement donot need to write return keyword
        MathOperation division=(a,b)->{
                                        if(a>b) return a/b;
                                        else return b/a;
                                    };
        MathOperation substraction=(a,b)->a-b;
       
        Lambda lambda=new Lambda();
        int val=lambda.executeOperation(10, 10, addition);
        System.out.println("\n addition value "+lambda.executeOperation(10, 10, addition));
        System.out.println("\n multiplication value "+lambda.executeOperation(10, 10, multiplicatiion));
        System.out.println("\n division value "+lambda.executeOperation(10, 10, division));
        System.out.println("\n substraction value "+lambda.executeOperation(10, 10, substraction));
       
        //Lambda for loop
        List list=Arrays.asList(66,7,8,9,77,60,80);        
        // for each
        list.forEach((i)->System.out.println(i));
        
        
        
        
    }
}
