import java.util.Scanner;
public class reverse_digits {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		try{
			int l=0,rev=0,r;
			int n=s.nextInt();
			int a=n;
			while(n!=0)
			{
				rev=rev*10;
				rev=rev+(n%10);
				n=n/10;
			}
			System.out.println(rev);
		}catch(Exception ex){
			System.out.println("Not a valid number");
		}
		s.close();
		}
}
