/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.LinkedList;

/**
 *
 * @author Farzana
 */
public class LinkedListPalindrome {
    
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        Node temp=head;
        // calculate len
        int len=0;
        while(head!=null){
            head=head.next;
            len++;
        }
        // get first half
        int arr[]=new int[len/2];
        int i=0;
        while(i<len/2){
            arr[i]=temp.data;
            temp=temp.next;
            i++;
        }
        
        if(len%2!=0) temp=temp.next; // ignore middle element if old 
        i--;
        // Compare Two Half
        while(temp!=null){
            if(arr[i]!=temp.data) return false;
            temp=temp.next;
            i--;
        }
        
        return true;
    }    
}

