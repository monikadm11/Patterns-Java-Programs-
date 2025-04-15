// BottomLeftAngleTriangle4

class BottomLeftAngleTriangle4

{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=i)
				{
					System.out.print(6-i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
/*
55555
 4444
  333
   22
    1
*/