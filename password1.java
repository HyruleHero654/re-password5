import java.util.Scanner;
public class password1{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
//		String answer="g";
		System.out.println("Enter the password: ");
//		System.out.println(ent);
		for(int x=0;x<5;x++)
		{
			String ent=in.nextLine();
			if(ent.equals("ffcs"))
			{
				System.out.println("login correct");
				break;
			}
			else{
				System.out.println("login incorrect");
			}
		}
	}
}
