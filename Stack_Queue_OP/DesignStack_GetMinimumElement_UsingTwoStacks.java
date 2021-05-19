/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.Stack_Queue_OP;

import java.util.Stack;

/**
 *
 * @author Farzana
 */
public class DesignStack_GetMinimumElement_UsingTwoStacks {
    
 //int minEle;
    Stack<Integer> s=new Stack<>();
    Stack<Integer> min=new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	    return min.isEmpty()?-1:min.peek();
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	if(s.isEmpty()) return -1;
	
	int p=s.pop();
	if(min.peek()==p) min.pop();
	
	return p;
    }

    /*push element x into the stack*/
    void push(int x)
    {
        //if(s.isEmpty()) minEle=x;
        if(min.isEmpty()){
            min.push(x);
            
        }else{
            if(min.peek()>=x){
                 min.push(x);
          }
        }
        s.push(x);
         
	
    }	
}

