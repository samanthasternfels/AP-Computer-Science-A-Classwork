import java.util.*;
public class ElevenRules
{
    private int number;
    
    public ElevenRules(int n)
    {
        number = n;
    }
    
    ArrayList<String> output = new ArrayList<String>();
    ArrayList<String> minusLast = new ArrayList<String>();
    
    public void twoDigit()
    {
        int lastDigit;
        while(number > 99)
        {
            output.add(String.valueOf(number));
            lastDigit = number%10;
            number = number/10;
            minusLast.add(String.valueOf(number) + "-" + String.valueOf(lastDigit));
            number -= lastDigit;
        }
        output.add(String.valueOf(number));
        if(number%11 == 0)
            minusLast.add("YES");
        else
            minusLast.add("NO");
            
        for(int i = 0; i < minusLast.size(); i++)
        {
            System.out.println(minusLast.get(i));
        }
        
        for(int i = 0; i < output.size(); i++)
        {
            System.out.println(output.get(i));
        }
    }
}