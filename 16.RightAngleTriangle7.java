// RightAngleTriangle7

class RightAngleTriangle7

{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print((char)(64+j));
				}
				else
				{
					System.out.print(" ");}
			}
			System.out.println(" ");
		}
	}
}
/*
A
AB
ABC
ABCD
ABCDE
*/