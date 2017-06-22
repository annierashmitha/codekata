import java.util.Scanner;
public class string_reverse {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String a=s.next();
		int j=0;
		char[] b=new char[a.length()];
		for(int i=a.length()-1;i>=0;i--)
		{
			while(j<a.length())
			{
				b[j]=a.charAt(i);
				j++;
				break;
			}	
		}
		String rev=new String(b);
		System.out.println(rev);
		s.close();
	}
}
