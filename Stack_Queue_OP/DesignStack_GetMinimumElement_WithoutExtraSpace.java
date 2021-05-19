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
public class DesignStack_GetMinimumElement_WithoutExtraSpace {
    
 int minEle;
    Stack<Integer> s=new Stack<>();
   

    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	    return s.empty()?-1:minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	    if(s.isEmpty()) return -1;
	    
    	int top=s.pop();
    	if(top<0){
    	    int temp=minEle;
    	    minEle=minEle-top;
    	    return temp;
    	}
        return top+minEle;	   
    }

    /*push element x into the stack*/
    void push(int x)
    {
        // stack eg: 4>6>3>8
        // eg:push(4)
        if(s.isEmpty()){
            s.push(x);
            minEle=x; // min=4,
        }else{
            s.push(x-minEle);
            if(x<minEle) minEle=x;
        }
	// Your code here	
    }	
}

