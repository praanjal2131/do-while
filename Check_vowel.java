/*wap to check char is vowel or consonant */


import java.util.*;
class Check_vowel
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tCheck the character is vowel or not");
	
	System.out.print("\n\t\t\tEnter the any character :");
	char ch=sc.next().charAt(0);
	
	if(ch=='a' ||ch=='e' || ch=='i' ||ch=='o' ||ch=='u' || ch=='A' || ch=='E' ||ch=='I' || ch=='O' ||ch=='U')
	{
	System.out.print("\n\t\tCharacter is vowel");
	}
	else
	{	
	System.out.print("\n\t\tCharacter is no vowel/consonant");
	}
	}
}