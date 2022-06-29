/*wap to Print odd numbers from 1 to 100*/


import java.util.*;
class DoWhileQ6
{
	public static void main(String[] args)
	{
	//Scanner sc= new Scanner(System.in);
	 System.out.print("\n\t\t\tPrint Odd numbers from 1 to 100\n\n");
	int n=1;
	int i=0;
	do
	{
	if(n%2==1)
	System.out.println("\t" +n);
	n++;
	}while(n<=100);
	
	
	}
}