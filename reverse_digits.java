import java.util.Scanner;
public class reverse_digits {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		try{
			int l=0,rev=0,r;
			int n=s.nextInt();
			int a=n;
			while(n>10)
			{
				l++;
				n=n/10;
			}
			l++;
			while(a>10)
			{
				for(int i=l-1;i>0;i--)
				{
					r=a%10;
					a=a/10;
					int p=1;
					for(int j=0;j<i;j++){
						p=p*10;
					}
					rev=rev+(r*p);
				}	
			}
			rev=rev+a;
			System.out.println(rev);
		}catch(Exception ex){
			System.out.println("Not a valid number");
		}
		s.close();
		}
}
