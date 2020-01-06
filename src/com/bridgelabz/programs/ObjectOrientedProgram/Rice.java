package com.bridgelabz.programs.ObjectOrientedProgram;

public class Rice 
{
	private String name;
	private int  weight;
	private int price;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Rice() 
	{
		
	}
	public Rice(String name, int weight, int price) 
	{
		super() ;
		this.name = name ;
		this.weight = weight ;
		this.price = price ;
	}
	
	public int getWeight() 
	{
		return weight;
	}
	
	public void setWeight(int weight) 
	{
		this.weight = weight;
	}
	
	public int getPrice() 
	{
		return price;
	}
	
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
}
