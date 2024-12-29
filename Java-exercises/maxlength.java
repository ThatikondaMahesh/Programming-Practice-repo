class Solution
{
    String ss;

    public int maxLengthBetweenEqualCharacters(String s) //throws Exception
    {
         boolean flag=false;
         int len=0;
         int p;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    ss=s.substring(i+1,j);
                    flag=true;

                }
            }
            if(this.ss!=null)
               p=ss.length();
            else
                p=0;

             if(p> len) 
                len=p;
        }
          if(flag == false)
            {
                    return -1;
             }

       return len; 
    }
}