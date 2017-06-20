import java.util.Scanner;
public class leapyear {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("Enter a year: ");
			int y=s.nextInt();
				if(y%100==0)
				{
					if(y%400==0){
					System.out.println("LeapYear");
					}
					else
					{
						System.out.println("Not a LeapYear");
					}
				}
				else if(y%4==0)
				{
					System.out.println("LeapYear");
				}
				else
				{
					System.out.println("Not a LeapYear");
				}
		}catch(Exception ex){
			System.out.println("Not a valid year");
		}
	}
}
