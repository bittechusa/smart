package com.bit.org;

import org.junit.Test;

public class ArraySort 
{

	
	@Test
	public void arraySort()
	{
		int[]num = {10, 12, 30,9,44,21};
		sort(num);
	}
	
	public void sort(int[]a)
	{
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	@Test
	public void moga()
	{
		int[] numb = {5,7,2,20,13,11};
		//mogaSort(numb);
		smartSort(numb);
		
	}
	
	public void mogaSort(int[] x)
	{
		System.out.println("Array size = "+x.length);
		
		for(int i =0; i<x.length; i++)
		{
			System.out.println(x[i]);
			System.out.println(i+ "position = "+x[i]);
			System.out.println();
			
		}
	
	}
	
	public void smartSort(int[] y)
	{
	   for(int m:y)
	   {
		   System.out.println(m);
		   
	   }
	}
	   
	   public void largest()
	   {

		   int[] numbers = {12,45,76,32,11};
		   
	        int largetst = numbers[0];
	       
	        for(int i=1; i< numbers.length; i++)
	        {
	                if(numbers[i] > largetst)
	                        largetst = numbers[i];
	               
	        } 
	   }
		
		
	
	
 }
