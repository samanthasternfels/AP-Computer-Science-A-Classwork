import java.util.Scanner;
public class Classwork3
{
   public static void main(String[] args)
   {
    /** Objective #1: Write an application to accept a side length for a prism,
        * and output the volume of a cube.
        *
        * Precondition: The user enters a number for the side length, and not a special character or letter
        * Postcondition: The program outputs a volume if the user enters a positive number. If the user
        *       does not enter a positive number, the program responds with "Invalid Input"
        */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a side length for your cube:");
    double side = scan.nextDouble();
    
    if (side > 0)
    {
        double volume = Math.pow(side, 3);
        System.out.println("Volume: " + volume);
        
    }
    
    else
        System.out.println("Invalid entry");
    

    /** Objective #2: Write an application to determine the number of solutions to a quadratic equation
     * The program accepts a, b, and c from a user, and tells the user how many solutions, if any, exist.
     * 
     * Precondition: The user enters numbers, and not special characters or letters
     * Postcondition: If there ar two solutions, the program outputs "Two solutions." If there is 
     *             one solution, the program outputs "One solution." Finally, if there 
     *             are no solutions, the program outputs "No real solutions."
        */      
    
    System.out.println("Enter a:");
    double a = scan.nextDouble();
    
    System.out.println("Enter b:");
    double b = scan.nextDouble();
    
    System.out.println("Enter c:");
    double c = scan.nextDouble();
    
    double discriminant = Math.pow(b,2) - 4*a*c;
    if (discriminant < 0)
          System.out.println("No real solutions.");
    else if (discriminant == 0)
          System.out.print("One solution.");
    else 
          System.out.println("Two solutions.");
    
    /** Objective #3: Write an application to determine which student you are most like
     * 
     * Precondition: The user enters numbers
     * Postcondition: If the user is most like Sam, the program outputs "You are most like Sam." 
     *              If the user is most like Charlie, the program outputs "You are most like Charlie." 
     *              If the user is most like Theo,the program outputs "You are most like Theo."
     *             
     */
    
    System.out.print("Do you play sports? Enter 1 for 'yes' and 2 for 'no'");
    double sports = scan.nextDouble();
    
    System.out.print("Are you in Leadership? Enter 1 for 'yes' and 2 for 'no'");
    double leadership = scan.nextDouble();
    
    if (sports == 1)
        if (leadership == 1)
            System.out.println("You are most like Sam.");
        else
            System.out.println("You are most like Charlie.");
    
    else
        if (leadership == 1)
            System.out.println("You are most like Theo.");
    
     /** Objective #4: How much senioritis does the user have?
     * 
     * Precondition: The user enters letters
     * Postcondition: If the user is very unmotivated they have a lot of senioritis.
     *             
     */
           
    System.out.println("Do you go to school?");
    String school = scan.next();
    
    System.out.println("Do you do your homework?");
    String homework = scan.next();
    
    System.out.println("Are you a senior?");
    String senior = scan.next();
    
    if (school.equals("No"))
        if (homework.equals("No"))
            if (senior.equals("Yes"))
                System.out.println("You have senioritis.");
            else
                System.out.println("You have senioritis but you're not a senior so get out of here.");
        else if (senior.equals("Yes"))
            System.out.println("You are beginning to get senioritis.");
        else
            System.out.println("Just go to school.");
    else if (homework.equals("No"))
        if (senior.equals("Yes"))
            System.out.println("You are beginning to get senioritis.");
        else 
            System.out.println("Just do your homework.");
    else
        System.out.println("You're doing great so far!");
  
    
    
    }
}
