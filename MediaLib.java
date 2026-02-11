/**
 * MediaLib
 *
 * Stores media items and tracks totals across all MediaLib objects.
 */
public class MediaLib
{
  // class (static) variables
  private static String owner = "unknown";
  private static int numEntries = 0;
  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;

  // instance variables
  private String libraryInfo;

  public MediaLib()
  {
    libraryInfo = "";
  }

  // class methods (accessors)
  public static String getOwner()
  {
    return owner;
  }

  public static void changeOwner(String o)
  {
    owner = o;
  }

  public static int getNumEntries()
  {
    return numEntries;
  }

  public static int getNumBooks()
  {
    return numBooks;
  }

  public static int getNumMovies()
  {
    return numMovies;
  }

  public static int getNumSongs()
  {
    return numSongs;
  }

  // instance methods
  public void addBook(Book b)
  {
    if (b != null)
    {
      libraryInfo += "Book: " + b + "\n";
      numBooks++;
      numEntries++;
    }
  }

  public void addMovie(Movie m)
  {
    if (m != null)
    {
      libraryInfo += "Movie: " + m + "\n";
      numMovies++;
      numEntries++;
    }
  }

  public void addSong(Song s)
  {
    if (s != null)
    {
      libraryInfo += "Song: " + s + "\n";
      numSongs++;
      numEntries++;
    }
  }

  public String toString()
  {
    if (numEntries == 0 || libraryInfo.length() == 0)
    {
      return "(empty)";
    }
    return libraryInfo;
  }
}
