import java.util.Scanner;
public class alpha {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("Enter a character : ");
			char c=s.next(".").charAt(0);
			c=Character.toLowerCase(c);
			if(Character.isAlphabetic(c)){
				System.out.println("Alphabet");
			}
			else{
				System.out.println("Not a Alphabet");
			}
		}catch(Exception ex){
			System.out.println("Not a character");
		}
	}
}
