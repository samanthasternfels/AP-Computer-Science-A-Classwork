
public class LoopsExamples
{
    public static void main(String[]args)
    {
        int x = 5; // declaring and intializing
        int y; // declaring a variable
        y = 2; // assigning or setting a value
        
        int numCoins = 4;
        numCoins = numCoins + 1;
        numCoins += 1;
        numCoins ++;
        System.out.println("Mario now has " + numCoins + " coins");
        
        int numLives = 0;
        numLives = numLives + 3;
        numLives += 3;
        System.out.println("Ultra round, extra lives for everyone!");
        numLives = numLives * 3;
        numLives *= 3;
        System.out.println("Mario has " + numLives + " lives");
        System.out.println("Uh oh, that was not good!");
        numLives = numLives/2;
        numLives /= 2;
        System.out.println("Mario has " + numLives + " lives");
        
        for (int i = 0; i < 8; i += 1)
        {
            System.out.println(i);
            // end of the loop is where i = i + 1

        }
        
        for (int i = 0; i < 50; i += 2)
        {
            System.out.println(i);
        }
        
        for (int i = 50; i > 0; i -= 2)
        {
            System.out.println(i);
        }
    }
}