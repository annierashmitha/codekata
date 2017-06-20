import java.util.Scanner;
public class oddeven {
	public static void main(String[] args){
		try{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number :");
			int a=s.nextInt();
			if(a%2==0)
			{
				System.out.println("Even number");
			}	
			else
			{
				System.out.println("odd number");
			}
		}catch(Exception ex){
			System.out.println("Exception (Invalid number)");
		}
	}
} 
