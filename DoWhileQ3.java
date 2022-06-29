/*wap to Print Natural numbers from 1 to */



import java.util.*;
class DoWhileQ3
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	 System.out.print("\n\t\t\tPrint Natural numbers from 1 to n\n\n");
	
	System.out.print("\n\t\t\tEnter the value of n :");
	int n=sc.nextInt();
	int i=1;
	do
	{
	
		System.out.println("\t" +i);
		i++;
	}while(i<=n);
	
	
	}
}