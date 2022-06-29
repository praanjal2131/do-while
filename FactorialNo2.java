import java.util.*;
class FactorialNo2
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("\n\t\tEnter any number :");
		int n=sc.nextInt();
	
		int i=n;
        	int fact=1;
	
	do
	{
		 fact=fact*i;
	  	 i--;
	}while(i>=1);
	  	System.out.print("\n\t\tFactorial no is: "+fact);
	
	
	}
}
