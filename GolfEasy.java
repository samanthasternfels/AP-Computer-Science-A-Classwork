import java.util.*;
public class GolfEasy
{
    private int par;
    private int score;
    
    public GolfEasy(int p, int s)
    {
        par = p;
        score = s;
    }
    public void setPar(int p)
    {
        par = p;
    }
     public void setScore(int s)
    {
        score = s;
    }
    public int getPar()
    {
        return par;
    }
    public int getScore()
    {
        return score;
    }
    public String toString()
    {
        int difference = par - score;
        if(difference == 0)
            return "Par";
        else if(difference == 1)
            return "Birdie";
        else if(difference == 2)
            return "Eagle";
        else if(difference == -1)
            return "Bogey";
        else if(difference == 2)
            return "Double Bogey";
        else
            return " ";
    }
}
