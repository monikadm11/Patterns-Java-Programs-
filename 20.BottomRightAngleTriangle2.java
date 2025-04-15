// BottomRightAngleTriangle2

class BottomRightAngleTriangle2

{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=(6-i))
				{
					System.out.print(i);
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
11111
2222
333
44
5
*/