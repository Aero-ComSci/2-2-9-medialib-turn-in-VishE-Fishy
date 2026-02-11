public class Song
{
  private String title;

  public Song(String t)
  {
    title = t;
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String t)
  {
    title = t;
  }

  public String toString()
  {
    return "\"" + title + "\"";
  }
}
