package com.bit.org;

public class Getter 
{

	private int a = 10;
	public int addget()
	{
		a = 10;
		System.out.println(a);
		return a;
	}
	public void addset(int b)
	{
		a = b;
		System.out.println(b);
	}
	public void m1()
	{
    //to divided a String
	String s = "how are you";
	String s1[]= s.split("");
	
	//to compare two String
	String x = "how";
	String y = "you";
	x.compareTo(y);
	
	}
	
	
}
