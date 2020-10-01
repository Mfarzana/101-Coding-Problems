/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue_OP;

import java.util.LinkedList;

/**
 *
 * @author Farzana
 */

//Stack Impementation using LinkedList
public class SimpleStack_With_LindkedList {
    private LinkedList<Object> list=new LinkedList<>();
    //push
    public void push(Object o){
        list.add(o);    
    }
    //pop
    public void pop(){
    list.removeFirst();
    }
    //peek
    public Object peek(){
    return list.getFirst();
    }
    public Boolean isEmpty(){
    return list.isEmpty();
    }
    
    public static void main(String args[]){
        SimpleStack_With_LindkedList stack =new SimpleStack_With_LindkedList();
        stack.push(1);
        stack.push(2);
        stack.push(1);
        System.out.println(" stack "+stack.peek());
        stack.pop();
        System.out.println(" stack "+stack.peek());

    }
}
