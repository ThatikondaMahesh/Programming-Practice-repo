// program to to demo on the string methods
import java.lang.*;
import java.io.*;

class Stringm
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=new String();
		String str2=new String();
		System.out.println("enter the Frist String ");
		str1=br.readLine();
		System.out.println("enter the Second String ");
		str2=br.readLine();
		String str3=str1.concat("	"+str2);
		System.out.println("   "+str3);
		int l=str3.length();
		System.out.println("length  of the string str3 is "+l);
		char ch=str3.charAt(11);
		System.out.println("is the 11 char"+ch);
		int s=str1.compareTo(str2);
		System.out.println("compares the strigs"+s);
		int s1=str1.compareToIgnoreCase(str2);
		System.out.println("comparesignore case the strigs"+s);
		boolean st=str1.equals(str2);
		System.out.println("equals the strigs"+st);
		boolean st1=str1.equalsIgnoreCase(str2);
		System.out.println("equals the strigs"+st1);
		boolean a=str1.startsWith("M");
	    System.out.println("Strins starting with the strigs"+a);
		boolean a1=str1.endsWith("A");
	    System.out.println("Strins endsWith with the strigs"+a1);
		int I=str1.indexOf("OM");
		System.out.println("String index  "+I);
		int I1=str1.lastIndexOf("A");
		System.out.println("String  last index "+I1);
		String m=str1.substring(2);		
		System.out.println("sub string is "+m);
		String m1=str1.substring(1,2);		
		System.out.println("sub string is "+m1);
		String b=str1.toLowerCase();
		System.out.println("lower case string is "+b);
		String b1=str2.toUpperCase();
		System.out.println("upper case string is "+b1);
		System.out.println(str1.trim());
		char f[]=new char[20];
		str1.getChars(1,3,f,0);
		System.out.println("getChars method "+f);
	}
	
}