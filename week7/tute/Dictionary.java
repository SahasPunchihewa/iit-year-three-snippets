package week7.tute;

public class Dictionary extends Book
{
    private int words; // number of words in the dictionary

    Dictionary(int words, int pages)
    {
        super(pages);
        // missing line 1 goes here - should call the parent constructor here this.words = words;
    }

    public String toString()
    {
        return this.words + " " + super.toString();
    }
}
