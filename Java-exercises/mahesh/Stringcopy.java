// program to demo on tthe strings operations
class Stringcopy
{
		public static void main(String aarg[])
		{
			String Str="Hello welcome to the javaa";
			String Str1="soorybfor the interuption";
			char ch[] =new char[20];
			Str.getChars(0,15,ch,0);
		    System.out.println(ch);
			String  s[];
			// string splitting 
			s=Str.split(" ");
			for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		// comparsion operators
		    if(Str==Str1)
				System.out.println("both are same ");
			else
				System.out.println("both are not s");
			String s1="MAHESH";
			String S="MAHESH";
			 if(S==s1)
				System.out.println("both are same ");
			else
				System.out.println("both are not s");
			System.out.println(s1+S);
		}
	
	
}