
/*wap tp add multiple numbers,ask user to take input from user as their need
  press 0 to terminate iputting after that calculate sum of that input. */




import java.util.*;
class Calculator_doWhile
{
	public static void main(String[] args)
	{   
                    int i=1;
		Scanner sc=new Scanner(System.in);

		System.out.print("\n\t\t\t    Calculator Multiple Additions  ");
		System.out.print("\n\t\t\t================\n\n");

		System.out.print("\n\t\t\t+:ADDITION ");
	
		System.out.print("\n\t\t\t================");
                do
              {
			System.out.print("\n\t\t\tEnter + for multiple additions: ");
			char c=sc.next().charAt(0);

			System.out.print("\n\t\t\tEnter number1=");
			int num1=sc.nextInt();

			System.out.print("\n\t\t\tEnter number2=");
			int num2=sc.nextInt();

		
		switch(c)
		{
			case '+':
			{
				int result =num1+num2;
				System.out.print("\n\t\t\tAddition Result= "+result);
				break;
			}
			
			default :
			 {
				System.out.print("\n\t\t\tEntered wrong choice.....");
				break;
			 }
		}//switch
                  System.out.println("\n  Do  you want to continue press 1  or 0( Terminate)");
                 i=sc.nextInt();
           }while(i!=0);             //while

	}
}