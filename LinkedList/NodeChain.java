/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Besty
 */
public class NodeChain {
    public static void main(String args[]){
    
    Node first=new Node();
    first.setValue(3);
    
    Node second=new Node();
    second.setValue(7);
    
    first.next=second;
    Node third=new Node();
    third.setValue(10);
    second.next=third;
    
    printValue(first);
   
    }
    private static void printValue(Node node){
        
        while(node!=null){
            System.out.println(" "+node.value);
            node=node.next;
        }
    
    }
    
}
class Node{
    public int value;
    public Node next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
