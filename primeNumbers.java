public class primeNumbers{
	public static void main(String args[])
	{
		int a=2;
		while(true)
		{
			int c=2;
			//int b=0;
			boolean prime=true;
			while(c<=a/2 && prime==true)
			{
				if(a%c==0)
				{
					prime=false;
				}
				c++;
			}
			if(prime==true)
			{
				System.out.println(a);
			}
			a++;
		}
	}
}
