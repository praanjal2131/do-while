import java.util.*;
class Fibonacci_Series2
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter the number a :");
	int n=sc.nextInt();

	int i=2;
	int a=0;
	int b=1;
	int c=0;
	
		do
		{
			System.out.print(c +" ");
			c=a+b;
			a=b;
			b=c;	
			i++;	
		}while(i<=n);
			
			
	}
}
