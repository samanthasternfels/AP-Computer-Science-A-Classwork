
/**
 * @author Sam Sternfels
 */
public class Partner
{
    private int age;
    private double height;
    private String name;
    public static String GENDER = "Male";
    public Partner()
    {
        age = 17;
        height = 6.0;
    }
    /**
    Constructor will take three parameter variables
     * @param age the age of my partner
     * @param height the height of my partner
     * @param name the name of my partner
     */
    public Partner(int a, double h, String n)
    {
        age = a;
        height = h;
        name = n;
    }
    /**
     * @param age the age we are changing to
     */
    public void setAge(int a)
    {
        age = a;
    }
    /**
     * @param height the height we are changing to
     */
    public void setHeight(double h)
    {
        height = h;
    }
    /**
     * @param name the name we are changing to
     */
    public void setHeight(String n)
    {
        name = n;
    }
    /**
     * Accessor method to get the age
     * @return the age of my partner
     */
    public int getAge()
    {
        return age;
    }
    /**
     * Accessor method to get the height
     * @return the height of my partner
     */
    public double getHeight()
    {
        return height;
    }
    /**
     * Accessor method to get the name
     * @return the name of my partner
     */
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return "His name is " + name + ", he is " + height + " feet tall, and he is " + age + " years old.";
    }
    public boolean equals(Partner p)
    {
        if (name == p.getName() && age == p.getAge() && height == p.getHeight())
            return true;
        return false;
    }
}


 