package week5.tute;

public class Letter implements Printable
{
    private String text;

    public Letter(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    @Override
    public void print()
    {
        System.out.println("Text: " + text);
    }
}
