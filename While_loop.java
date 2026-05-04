package java_demo;

public class While_loop {

	public static void main(String[] args) {
		
		int i=1;
		while (i<=10)
			
		{
			System.out.print(i);
			i++;
		}
		
		System.out.println("\n");
		
		int j=10;
		while (j>=1)
		{
			System.out.print(j);
			j--;
		}
		
		System.out.println("\n");
		
		
		int k=1;
		while (k<= 10)
		{
			if (k%2==0)
			{
			System.out.print("\t"+"even");
			}
			else
			{
				System.out.print("\t"+"Odd");
			}
			k++;
		}
		
		
		System.out.println("\n");
		
		
		int num=15;
		int l=1;
		while (l<=10)
		{
			System.out.println(num +"*"+ l+"="+num*l);
			l++;
		}
		
		
	}

}
