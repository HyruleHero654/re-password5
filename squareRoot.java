import java.util.Scanner;
public class squareRoot {
	public static void main(String args[]) {
		//KeyController kC=new KeyController(Canvas.getInstance(), new starter());
		Scanner test=new Scanner(System.in);
		System.out.println("Please enter a positive number: ");
		int numb=test.nextInt();
		System.out.println(numb);
		sqrRoot(numb);
	}
	public static void sqrRoot(double a)
	{
		double b=0;
		int toggle=0;
		if(a<0)
		{
			System.out.println("Square roots of negative numbers don't exist.");
			toggle=1;
		}
		while(b*b<=a){
			if(b*b==a)
			{
				System.out.println("The square root of your number is: " + b);
				toggle=1;
			}
			b++;
		}
		b=2;
		double c;
		double rad=0;
		while(b<a&&toggle==0)
		{
			c=b*b;
			if(a%c==0)
			{
				rad=b;
			}
			b++;
		}
		if(rad!=0&&toggle==0)
		{
			double end= rad*rad;
			System.out.println("The square root of your number is: " + rad + "rad" + a/end);
		}
		else if(toggle==0)
		{
			System.out.println("The square root of your number is: " + "rad" + a);
		}
	}
}
