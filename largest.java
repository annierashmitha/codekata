import java.util.Scanner;
public class largest {
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	try{
		System.out.println("Enter 3 numbers : ");
		int l=s.nextInt();
		for(int i=0;i<2;i++)
		{
			int a=s.nextInt();
			if(a>l)
			{
				l=a;
			}
		}
		System.out.println("Largest number is : "+l);
	}catch(Exception ex){
		System.out.println("Not a valid number");
	}
}
}
