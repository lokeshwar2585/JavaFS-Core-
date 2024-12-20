package com.lokesh.java;

class Vegetables{
	private String name;
	private String color;
	private int cost;
	private int size;
	
	//Constructor
	Vegetables(String name,String color,int cost,int size)
	{
		name=name;
		color=color;
		cost=cost;
		size=size;
		
	}
	//add getters
	public String getName()
	{
		return name;
		
	}
	public String getColor()
	{
		return color;
	}
	public int getCost()
	{
		return cost;
	}
	public int getSize()
	{
		return size;
	}
}
public class Shadow{

	public static void main(String[] args) {
		Vegetables veg=new Vegetables("Tomato","Red",10,5);
		System.out.println(veg.getName());
		System.out.println(veg.getColor());
		System.out.println(veg.getCost());
		System.out.println(veg.getSize());

	}

}
