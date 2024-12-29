// program  to polynomial class
public class Polynomial
{
	int degCoff[];
	Polynomial()
	{
		degCoff=new int[10];
	}
	
	public void setCoffeicent(int degree ,int coff)
	{
		if(degree>=degCoff.length)
		{
			capacity(degree+2);
			
		}
		degCoff[degree]=coff;
		
	}
	public void capacity(int size)
	{
		int []temp=degCoff;
	   degCoff=new int[size];
	   for(int i=0;i<temp.length;i++)
	   {
		   degCoff[i]=temp[i];
	   }
	   
	}
	public void print()
	{
		for(int i:degCoff)
		{
			System.out.print(i+" | ");
		}
		System.out.println();
	}
	public Polynomial add(Polynomial otherPoly) 
	{
        Polynomial result = new Polynomial();
        int maxLength = Math.max(this.degCoff.length, otherPoly.degCoff.length);
        result.capacity(maxLength);

        for (int i = 0; i < maxLength; i++) 
		{
            int coeff1 = (i < this.degCoff.length) ? this.degCoff[i] : 0;
            int coeff2 = (i < otherPoly.degCoff.length) ? otherPoly.degCoff[i] : 0;
            result.setCoffeicent(i, coeff1 + coeff2);
        }

        return result;
    }
	public Polynomial subraction(Polynomial otherPoly) 
	{
        Polynomial result = new Polynomial();
        int maxLength = Math.max(this.degCoff.length, otherPoly.degCoff.length);
        result.capacity(maxLength);

        for (int i = 0; i < maxLength; i++) 
		{
            int coeff1 = (i < this.degCoff.length) ? this.degCoff[i] : 0;
            int coeff2 = (i < otherPoly.degCoff.length) ? otherPoly.degCoff[i] : 0;
            result.setCoffeicent(i,coeff1 - coeff2);
        }

        return result;
    }
	public Polynomial multiply(Polynomial otherPoly) 
	{
        Polynomial result = new Polynomial();
        int maxLength = this.degCoff.length + otherPoly.degCoff.length - 1;
        result.capacity(maxLength);

        for (int i = 0; i < this.degCoff.length; i++) 
		{
            for (int j = 0; j < otherPoly.degCoff.length; j++) 
			{
                int product = this.degCoff[i] * otherPoly.degCoff[j];
                result.degCoff[i + j] += product;
            }
        }

        return result;
    }
}
