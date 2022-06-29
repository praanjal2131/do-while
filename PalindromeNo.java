/* wap to print all palindrome numbers from 10 to 200*/



import java.util.*;
class PalindromeNo
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("\n\t\tEnter the vlue of n 200 :");
		int n=sc.nextInt();
		int i=10;
		int rem;int rev=0;
		do
		{
			rem=i%10;
			rev=(rev*10)+rem;
			if(n==rev)
			System.out.print("\n\t\tpalindrome numbers are: " +rev);
			i=i/10;
			System.out.print("\t"+rem);
		}while(i<=200);
		/*if(n==rev)
		{
	
			System.out.print("\n\t\tpalindrome numbers are: " +rev);
		}
		else
			System.out.print("\n\t\tNumber is not palindrome");*/
	
	}
}
