import java.util.Scanner;
public class no_of_digits {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		try{
			int l=0;
			System.out.println("Enter a number : ");
			int n=s.nextInt();
			while(n>10)
			{
				l++;
				n=n/10;
			}
			l++;
			System.out.println("Number of digitts in "+l);
		}catch(Exception ex){
			System.out.println("Not a valid number");
		}
		}
}
