import java.util.Scanner;
public class loopsum {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		try{
			int sum=0;
			System.out.println("Enter count of numbers : ");
			int c=s.nextInt();
			System.out.println("Enter the numbers : ");
			for(int i=0;i<c;i++)
			{
				int a=s.nextInt();
				sum+=a;
			}
			System.out.println("Sum of "+c+" numbers is : "+sum);
		}catch(Exception ex){
			System.out.println("Not a valid count");
		}
	}
}
