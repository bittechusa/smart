
public class ArrayPractice 
{
	public static void main(String[] args)
	{
		int a[]={4,7,10,12,20};
		
		System.out.println(a[0]);
		
		String color[]={"red","green","blue","black","pink"};
		System.out.println(color[3]);
		
		for(int i=0; i<=4; i++)
		{
			System.out.println(a[i]);
		}
		for(int j=0; j<=4; j++)
		{
			System.out.println(color[j]);
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		for(int j=0; j<color.length; j++)
		{
			System.out.println(color[j]);
		}
		for(int z=0; z<color.length;z++)
		{
			if(color[z].contains("red"))
			{
				System.out.println("found");
				break;
			}
			else
			{
				System.out.println("not found");
				
			}
		}
			
			
		 
		
	}

}
