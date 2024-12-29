// display binary number
class Binary
{
 public static void main(String ars[])
 {
	 int num =0b1010;
	  System.out.printf("number in the decimal=%d",num);
	
	 System.out.printf("number in the octal=%o",num);
	 
	 System.out.printf("number in the binary %s",num);
	 System.out.printf("number in the hexadecimal=%x",Integer.toBinaryString(num));

 }


}