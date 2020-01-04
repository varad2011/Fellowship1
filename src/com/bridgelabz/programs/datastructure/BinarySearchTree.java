package com.bridgelabz.programs.datastructure;

public class BinarySearchTree 
{
	public class Node 
	{
	 int data ;
	 Node left ;
	 Node right ;
	 	public Node( int data ) 
	 	{
		 this.data = data ;
		 this.left = null ;
		 this.right = null ;
	 	}
	 	
	}
	Node root ;
	public  void insert ( int data ) 
	{	
		Node current = root ;
		Node newNode = new Node(data);
		if ( root == null ) 
		{
			root = newNode ;
			
		}
		
		else  
		{
			if( data < current.data  ) 
			{
				current.left.data = data ;
			}
			else 
			{
				current.right.data = data ;
			}
		}
		
	}
	public void  displayTree() 
	{
		Node current = root ;
		if(root == null ) 
		{
			System.out.println(" list is empty " ) ;
		}
		else 
		{
			
		}
	}
	
	public static void main(String[] args)
	{
		BinarySearchTree  tree = new BinarySearchTree () ;
		tree.insert(1);
		tree.insert(4);
		//tree.insert(2);
		

	}
	

}
