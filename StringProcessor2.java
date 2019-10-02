public class StringProcessor2
{
    public static String withoutEnds(String str)
    {
       return (str.substring(1, str.length()-1)); 
        
    }
    public static String front2(String str)
    {
       return (str.substring(str.length()-2) + str.substring(0, str.length()-2));
        
    }
    public static String firstFour(String str)
    {

        if (str.length() >= 4)
            return (str.substring(0,4));
        else if (str.length() == 3)
            return (str + "#");
        else if (str.length () == 2)
            return (str + "##");
        else if (str.length() == 1)
            return (str + "###");
        else
            return (str + "####");
        
    }
    public static boolean frontAgain(String str)
    {  if (str.length() > 2)
            if (str.substring(0,2).toLowerCase().equals(str.substring(str.length()-2)))
                return true;
            else 
                return false;
       else if (str.length() == 2)
            return true;
       else
            return false;
         
    }
    public static String loveAtFirstSight(String str)
    {  
       if (str.toLowerCase().equals("water polo"))
            return ("So I love you");
       else if(str.toLowerCase().equals("baseball"))
            return ("Unless you are over 6ft don't talk to me");
       else
            return ("Get out of my face");
      
    }
}
  