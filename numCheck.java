package guvi;

import java.util.Scanner;
public class numCheck {
	public static void main(String[] args){
		try{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=s.nextInt();
		if(n>0)
		{
			System.out.println("Positive Number");
		}
		else if(n<0)
		{
			System.out.println("Negative Number");
		}
		else if(n==0)
		{
			System.out.println("Number is zero");
		}
		else
		{
			System.out.println("Invalid Number");
		}
		}catch(Exception ex)
		{
			System.out.println("Exception (Invalid number)");
		}
	}
}
