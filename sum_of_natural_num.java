import java.util.Scanner;
public class sum_of_naturalnum {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("Enter the count of numbers: ");
			int c=s.nextInt();
			int sum=0;
		  for(int i=1;i<=c;i++)
		  {
			  sum=sum+i;
		  }
		  System.out.println("Sum of "+c+" natural numbers is "+sum);
		  }catch(Exception ex){
		System.out.println("Not a valid number");
	}
	}
}
