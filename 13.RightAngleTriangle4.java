// RightAngleTriangle4

class RightAngleTriangle4

{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(6-j);
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
5
54
543
5432
54321
*/