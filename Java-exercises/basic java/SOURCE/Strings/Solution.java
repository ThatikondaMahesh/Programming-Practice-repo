
import java.util.HashSet;

public class Solution 
{
    public static int countSubStrings(String str, int k)
     {
           String str1="";
           int count=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                str1="";
                for(int p=i;p<=j;p++)
                {
                        str1=str1+str.charAt(p);

                    if(str1.length()==k)
                    {
                        HashSet<Character> hs=new HashSet<>();
                        for (char c : str1.toCharArray()) 
                        {
                            if(!hs.contains(c))
                                 hs.add(c);
                        }
                        
                        if(hs.size()==str1.length())
                        {
                            count++;

                        }

                    }


                }
            }
        }
        return count;
    }
    public static void main(String ar[])
    {
        String str="abcad";
        int k=2;
        System.out.println(countSubStrings(str, k));

    }



}

