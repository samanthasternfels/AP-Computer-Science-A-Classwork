 import java.util.Scanner;

public class Classwork5
{
    public static void main(String[] args)
    {
    /*  
        // Exercise 1
              for(int i = 0; i < 500; i += 1)
        {
            double randomNumber = (int)(Math.random()*6);
            System.out.println("You just rolled a: " + (randomNumber + 1));
        
    }
     
    // Exercise 2
            for(int i = 0; i < 500; i ++)
        {
        double dice1 = (int)(Math.random() * 6) + 1;
        double dice2 = (int)(Math.random() * 6) + 1;
        
        double sum = dice1 + dice2;
        
        System.out.println("You just rolled a: " + sum);
        
        if (sum == 7 || sum == 11)
            {System.out.println("Yay you win!");}
        else if (sum == 2 || sum == 3 || sum == 12)
            {System.out.println("You lose!");}
        else
            {System.out.println("Keep playing!");}
        
    }
   
    // Exercise 3
   
    System.out.println("I am the Magic 8 Ball");
    System.out.println("Ask me question: ");
    Scanner scan = new Scanner(System.in);
    String answer = scan.nextLine();
    
    
        for (int k = 0; k < 1; k ++)
        {
            double question = (int)(Math.random() * 7 + 1);
            
            if (question == 1)
                System.out.println("Well, it is a possibility.");
            else if (question == 2)
                System.out.println("I am tired, come back later.");
            else if (question == 3)
                System.out.println("I think yes but don't trust me man.");
            else if (question == 4)
                System.out.println("Of course, who would think otherwise.");
            else if (question == 5)
                System.out.println("HELL NO are you out of your mind.");
            else if (question == 6)
                System.out.println("Back the frick up and reevaluate your question.");
            else if (question == 7)
                System.out.println("I don't know dude that's tough.");
            else
                System.out.println("You bet your mama I don't know what I am talking about");
     
    // Exercise 4
    
    System.out.println("How many sides would you like your dice to have?");
    Scanner scan = new Scanner(System.in);
    int sides = scan.nextInt();
    
    double rolls = (int)(Math.random() * sides + 1);
    
    if (sides < 1)
        System.out.println("Invalid Entry");
    else
        System.out.println("Your program just rolled a " + rolls);
    */    
           
    // Exercise 5
    
    System.out.println("Try to guess my number. It's between 1 and 10.");
    System.out.println("Enter your guess: ");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    
    
    double myNumber = (int)(Math.random() * 10 + 1);
    
    if (number == myNumber)
        System.out.println("Yes, you got it! My number was " + number);
    else
        System.out.println("Nope, try again. My number was " + myNumber);
    }
}



