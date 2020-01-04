package com.bridgelabz.programs.datastructure;

public class LinkedList < T >
{
	
	public class Node < T >
	{ 
	 T data ;
	 Node next ;
	 
	 public Node( T data ) 
	 {
		 this.data = data ;
		 this.next = null ;
	 }
	 
	}
	Node head ;
	Node tail ;
	public void addAtEnd ( T data ) 
	{
		Node newNode = new Node(data ) ;
		
		if( head == null  ) 
		{
		 head = newNode ;
		 tail = newNode ;
		}
		else 
		{
			tail.next = newNode ;
			tail = newNode ;
		}
	}
	public void addAtStart( T data ) 
	{
		Node newNode = new Node(data) ;
		if( head == null ) 
		{
		 head = newNode ;
		 tail = newNode ;
		}
		else 
		{
			Node headstore = head ;
			head = newNode ;
			newNode.next = headstore ;
		}
	}
	
	public void displayNode() 
	{
	     Node current = head ;  
	        if(head == null) {  
	            System.out.println("List is empty") ;  
	             
	        }  
	          
	        
	        while(current != null) 
	        {  
	            
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	        System.out.println();  
	     

	}
	public static void main(String[] args) 
	{
		LinkedList < Integer  > list = new LinkedList <Integer  >();
	

	}

}
