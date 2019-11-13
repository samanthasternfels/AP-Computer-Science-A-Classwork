
public class BookTester
{
    public static void main(String[] args)
    {
      book b1 = new book("Old Man and the Sea", "Enest Hemingway", 340);
      book b2 = new book("The Highly Sensitive Person", "Elaine Aron", 200);
      System.out.println(b1.getTitle());
      System.out.println(b1.getAuthor());
      System.out.println(b1.getPageNumber());
      b1.setTitle("Old Man & the Sea");
      b1.setAuthor("Ernest Hemingway");
      b1.setPageNumber(345);
      System.out.println(b1.getTitle());
      System.out.println(b1.getAuthor());
      System.out.println(b1.getPageNumber());
      
      
    }
}
