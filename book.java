
public class book
{
    private String title;
    private String author;
    private int pageNumber;
    
    public book(String t, String a, int pgnm)
    {
      title = t;
      author = a;
      pageNumber = pgnm;
    }
    public void setTitle(String t)
    {
        title = t;
    }
     public void setAuthor(String a)
    {
        author = a;
    }
     public void setPageNumbers(int pgnm)
    {
        pageNumber = pgnm;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPageNumber()
    {
        return pageNumber;
    }
    public String toString()
    {
        return title + ", " + author + ", " + pageNumber;
    }
}
