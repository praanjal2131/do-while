import java.util.*;
class Print_Table
{

	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("\n\t\t\tPrint table of any number\n\n");
	System.out.println("Enter any number :");
	int n=sc.nextInt();
	int i=1;
	do
	{
	
	
		System.out.println(+n+" * "+i+"= " + (n*i) );
	
		i++;
	
	}while(i<=10);
	}
}
