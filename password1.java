import java.util.Scanner;
public class password1{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		String answer="c";
		System.out.println("Enter the password (it is a single, lowercase letter): ");
		String in=a.nextLine();
		if(in.length()>1)
		{
			System.out.println("I said the password is a single, lowercase letter!");
		}
		else if(in.equals(answer))
		{
			System.out.println("login correct");
		}
		else
		{
			System.out.println("login incorrect");
		}
	}
}
