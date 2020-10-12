/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems;

/**
 *
 * @author Farzana
 */
class MyException extends Exception {
    MyException() {
    } MyException(String s) {
        super(s);
    }
}

public class FunDo {
    static void throwException() throws MyException {
        throw new MyException();
    } public static void main(String[]args) {
        try {
           // System.exit(0);
            throwException();
            return;
        }
     
        catch(MyException exp) {
            System.out.println("MyException");
            return;
        }
           catch(Exception  r) {
            System.out.println("RuntimeException:" + r);
        }
        
        finally {
            System.out.println("Finally MyException");
        }
    }
}