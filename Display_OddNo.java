import java.util.*;
class Display_OddNo
{
	public static void main(String[] args)
	{
	//Scanner sc= new Scanner(System.in);
	 System.out.print("\n\t\t\tPrint Odd numbers from 200 to 300\n\n");
	int n=200;
	
	do
	{
	if(n%2==1)
	System.out.println("\t" +n);
	n++;
	}while(n<=300);
	
	
	}
}