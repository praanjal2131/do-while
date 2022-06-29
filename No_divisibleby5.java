import java.util.*;
class No_divisibleby5
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tNumber divisible by 5 ");
	
	System.out.print("\n\t\t\tEnter the value of n :");
	int n=sc.nextInt();
	
	if(n%5==0)
	
	System.out.print("\n\t\tIt is divisible by 5");
	else	
	System.out.print("\n\t\tIt is not divisible by 5");
	}
}