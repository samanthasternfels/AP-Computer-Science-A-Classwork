
import java.util.Scanner;
public class Classwork4 // class header
{
       public static void main(String[] args) // method header
       {
           Scanner scan = new Scanner(System.in);
           // Write a program that prompts a user for their name!
           System.out.println("Enter your name:");
           String name = scan.nextLine();
           
           System.out.println("Enter your age:");
           int age = scan.nextInt();
          
           if (name.equals("Sam") || name.equals("sam"))
                 System.out.println("Wow, what a great name!");
           else if (name.equals("Theo") || name.equals("theo"))
                 System.out.println("That's pretty good too, not great tbh.");
           else if (name.equals("Elena") || name.equals("elena"))
                 System.out.println("So I saw your phone number online and I was thinking...");
           else
                 System.out.println("Not going to lie, your name isn't great " + name + ".");
                 
           if (age >= 21)
                System.out.println("You are acutally legal, for real real.");
           else if (age >= 16)
                System.out.println("We both know you are not legal to drink but is that going to stop you...?");
           else
                System.out.println("Go home, and forget alcohol is a thing.");
                 
                 
          
        }
}