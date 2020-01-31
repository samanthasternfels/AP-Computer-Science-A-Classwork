import java.util.*;
import java.util.Random;
public class Classwork2s2
{
    public static void main(String[] args)
    {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("Soccer");
        sports.add("Softball");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Soccer");
        sports.add("Skiing");
        sports.add("Rowing");
        
        System.out.println("Question 1: ");
        printElements(sports);
        System.out.println("Question 2: ");
        insertElement(sports, "Football");
        System.out.println("Question 3: "); 
        System.out.println(returnElement(sports, 3));
        System.out.println(" ");
        System.out.println("Question 4: ");
        removeThirdElement(sports);
        System.out.println("Question 5: ");
        System.out.println(searchForElement(sports, "Soccer"));
        System.out.println(" ");
        System.out.println("Question 6: ");
        System.out.println(searchAndCountElement(sports, "Soccer"));
        System.out.println(" ");
        System.out.println("Question 7: ");
        System.out.println(copyAndReturnList(sports));
        System.out.println(" ");
        System.out.println("Question 8: ");
        shuffleElements(sports);
        
    }
    // #1
    public static void  printElements(ArrayList<String> sports)
    {
        for(int i = 0; i<sports.size(); i++)
            System.out.println(sports.get(i));
        System.out.println(" ");
    }
    // #2
    public static void insertElement(ArrayList<String> sports, String name)
    {
        sports.add(0, name);
        for(int i = 0; i<sports.size(); i++)
            System.out.println(sports.get(i));
        System.out.println(" ");
    }
    // #3
    public static String returnElement(ArrayList<String> sports, int i)
    {
        return sports.get(i);
    }
    // #4
    public static void removeThirdElement(ArrayList<String> sports)
    {
        sports.remove(2);
        for(int i = 0; i<sports.size(); i++)
            System.out.println(sports.get(i));
        System.out.println(" ");
    }
    // #5
    public static int searchForElement(ArrayList<String> sports, String name)
    {
        return sports.indexOf(name);
    }
    // #6
    public static int searchAndCountElement(ArrayList<String> sports, String name)
    {
        int count = 0;
        for(int i = 0; i<sports.size(); i++)
            if(sports.get(i).equals(name))
                count += 1;
        return count;
    }
    // #7
    public static ArrayList<String> copyAndReturnList(ArrayList<String> sports)
    {
        ArrayList<String> n = new ArrayList<String>();
        for(int i = 0; i<sports.size(); i++)
            n.add(sports.get(i));
        return n;
    }
    // #8
    public static void shuffleElements(ArrayList<String> sports)
    {
        ArrayList<String> n = new ArrayList<String>();
        Random rand = new Random();
        for(int i = 0; i< 7; i++)
        {
            n.add(sports.get(rand.nextInt(sports.size())));
            sports.remove(sports.indexOf(n.get(i)));
        }
        System.out.println(n);
        System.out.println(" ");
    }
}
    