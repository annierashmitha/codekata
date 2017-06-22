import java.util.Scanner;
public class string_to_int {
	public static void main(String[] args){
		try{
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	int n=Integer.parseInt(s1);
	System.out.println(n);
	s.close();
		}catch(Exception ex)
		{
			System.out.println("Not a valid number");
		}
	}
}
