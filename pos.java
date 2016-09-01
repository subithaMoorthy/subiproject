import java.io.*;
import java.util.*;
class pos
{
	public static void main(String args[])
	{
		int n;
		Scanner scr=new Scanner(System.in);
		n=scr.nextInt();
		if(n<0)
		{
			System.out.println("Negative number");
		}
		else if(n>0)
		{
			System.out.println("positive number");
		}
		else if(n==0)
		{
			System.out.println("Zero");
		}
	}
}
