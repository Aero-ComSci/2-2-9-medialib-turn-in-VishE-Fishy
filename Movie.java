public class Movie
{
  private String title;
  private double duration;

  public Movie(String t, double d)
  {
    title = t;
    duration = d;
  }

  public String getTitle()
  {
    return title;
  }

  public double getDuration()
  {
    return duration;
  }

  public void setTitle(String t)
  {
    title = t;
  }

  public void setDuration(double d)
  {
    duration = d;
  }

  public String toString()
  {
    return "\"" + title + "\" (" + duration + " hrs)";
  }
}
