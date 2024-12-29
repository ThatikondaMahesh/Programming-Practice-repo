// program to polynomial user
public class PolyUser
{
	public static void main(String ar[])
	{
		Polynomial p1 = new Polynomial();
        p1.setCoffeicent(3, 4);
        p1.setCoffeicent(10, 0);
        p1.setCoffeicent(40, 30);
		System.out.println("Frist array");
        p1.print();

        Polynomial p2 = new Polynomial();
        p2.setCoffeicent(2, 5);
        p2.setCoffeicent(10, 10);
        p2.setCoffeicent(20, 20);
		System.out.println("Second array");

        p2.print();
		System.out.println(" Addition array");
        Polynomial sum = p1.add(p2);
        sum.print();
		
		
		Polynomial sub=p1.subraction(p2);
        System.out.println("Subraction array");
		sub.print();
		
		Polynomial multiply=p1.multiply(p2);
		System.out.println("Multiplication array");
		multiply.print();
	
	}
}