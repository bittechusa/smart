import java.util.Arrays;

import org.junit.Test;


public class MaxMin 
{

	@Test
	public void sort()
	{
		int[] num = {12,34,25,36,45,76,16,49,76,43};
		
	}
	
	public void arraySort(int[] x)
	{
		
		
		
	}
	@Test
	public void m1()
	{
		int[] num = {12,34,25,36,45,76,16,49,99,43};
		Arrays.sort(num);
		
		int max = num[0];
		for(int i=1; i<num.length; i++)
		{
			if(num[i] > max)
			{
				max = num[i];
			}
		}
		System.out.println(max);
		
		int min = num[0];
		for(int i = 1; i<num.length;i++)
		{
			if(num[i] < min)
			{
				min = num[i];
			}
		}
		System.out.println(min);
				
	}
	
	
	
	
	
	
	
	
}
