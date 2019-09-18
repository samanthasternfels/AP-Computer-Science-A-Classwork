import java.util.Scanner;

public class Classwork2
{
   public static void main(String[] args)
   {
        // Construct a scanner object    
        Scanner my_special_scan = new Scanner(System.in);

        // my example:
        
        System.out.println("Enter the number of goals you have scored this season:");
        double userInput1 = my_special_scan.nextDouble();
        System.out.println("Enter the number of games you have played this season:");
        double userInput2 = my_special_scan.nextDouble();
        double comparisonData = userInput1/userInput2;
        System.out.println("Your goals per game average is " + comparisonData);
    
        
   }  
}
