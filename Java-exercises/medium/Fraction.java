public class Fraction
{
	int numerator;
	int denominator;
	public Fraction(int numerator,int denominator)
	{
		this.numerator=numerator;
		this.denominator=denominator;
		simplify();
	}
	private void simplify()
	{
		int gcd=1;
		int a=numerator;
		int b=denominator;
		int small=Math.min(numerator,denominator);
		while(a!=0&&b!=0)
		{
			if(a>b)
			{
				a=a%b;
			}
			else
			{
				b=b%a;
			}
			
		}
		if(a!=0)
		{
			gcd=a;
		}
		else
		{
			gcd=b;
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
	}
	public void print()
	{
		System.out.println(numerator+"/"+denominator);
	}
	public void increment()
	{
		numerator=numerator+denominator;
		simplify();
		
	}
}