package java_demo;

public class Break_continue_project {

	public static void main(String[] args) {
		
				for (int i=1; i<=20;i++)
		{
			if(i%2==0) 
			{
				break;
			}
			
			else
			{
				System.out.print(i);
			}
		}

		for (int i=1; i<=20;i++)
		{
			if(i%2==0) 
			{
				continue;
			}
			
			else
			{
				System.out.print(" "+i);
			}
		}
		
		System.out.println("\n");
		
		String name="Sam Peterson";
		for(int l=0;l<name.length();l++)
		{
			char ch=name.charAt(l);
			if(ch==' ') 
			{
				break;
			}
			
			else
			{
				System.out.print(ch);
			}
		}
		
		System.out.println("\n");
		
		String name1="Sam Peterson";
		for(int n=0;n<name.length();n++)
		{
			char ch1=name1.charAt(n);
			if(ch1==' ') 
			{
				continue;
			}
			
			else
			{
				System.out.print(ch1);
			}
		}
	}

}
