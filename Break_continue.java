package java_demo;

public class Break_continue {

	public static void main(String[] args) {
		
		for (int i=1;i<=10;i++)
		{
			if(i==7)
			{
				break;
			}
			else
			{
				System.out.print(i);
			}
		}
		
		for(int j=1;j<=10;j++)
		{
			if(j==6)
			{
				continue;
			}
			else
			{
				System.out.print(" "+j);
			}
		}

	}

}
