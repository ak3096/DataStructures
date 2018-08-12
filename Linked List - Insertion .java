/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    Node head;   //Head of the list
    class Node{
        //structure of a Node
        int data;
        Node next;
        
        //Constructor initializing Node
        Node(int d){
            data = d;
            next = null;
        }
       
    }
    public void push(int new_data){
        //Allocate and assign a value to the Node
            Node new_node = new Node(new_data);
            
        //Assign head to the node to make a new Head   
            new_node.next = head;
        
        //Move the head to point to new_node    
            head = new_node;
    }
    
    //Print the List
    public void print(){
        
        //Assign head to the reference
        Node nd = head;
        
        while(nd !=null){
            
            //Print Node data
            System.out.print(nd.data+"->");
            
            //Update node reference with node.next
            nd = nd.next; 
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		//Initializing class
		Codechef list = new Codechef();
		
		//Push 3 and replace head
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		//Print the list
		list.print();
	}
}
