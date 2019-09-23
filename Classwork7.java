import java.util.Scanner;

public class Classwork7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        
        int age = scan.nextInt();
        
        System.out.println(canIVote(age));
        System.out.println(canIDrive(age));
        System.out.println(canIDrink(age));
        
        System.out.println("How many goals have you scored?");
        int goals = scan.nextInt();
        System.out.println("How many games have you played?");
        int games = scan.nextInt();
        
        System.out.println("Your goals per game average is: " + findGoalsPerGame(goals, games));
        
        
    }
    
    public static double findSum(int a, int b)
    {
        return a + b;
        
    }
    
    public static double findGoalsPerGame(double a, double b)
    {
        return a/b;
        
    }
    
    public static String canIVote(int age)
    {
        if (age >= 18)
            return "You can vote!";
        else
            return "You can't vote.";
    }
    
    public static String canIDrive(int age)
    {
        if (age >= 16)
            return "You can drive!";
        else
            return "You can't drive.";
    }
    
    public static String canIDrink(int age)
    {
        if (age >= 21)
            return "You can drink!";
        else
            return "You can't drink.";
    }
}
