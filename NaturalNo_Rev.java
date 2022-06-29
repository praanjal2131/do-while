/*wap to Print Natural numbers from n to 1 */



import java.util.*;
class NaturalNo_Rev
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	 System.out.print("\n\t\t\tPrint Natural numbers from n to 1\n\n");
	
	System.out.print("\n\t\t\tEnter the value of n :");
	int n=sc.nextInt();
	int i=n;
	do
	{
	
		System.out.println("\t" +i);
		i--;
	}while(i>=1);
	
	
	}
}