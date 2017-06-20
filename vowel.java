import java.util.Scanner;
public class vowel {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("Enter a character : ");
			char c=s.next(".").charAt(0);
			c=Character.toLowerCase(c);
			if(Character.isAlphabetic(c)){
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
			}}
			else{
				System.out.println("Invalid Character");
			}
		}catch(Exception ex){
			System.out.println("Invalid Character");
		}
	}
}
