package week5.tute;

public class PrintableTester
{
    public static void main(String[] args)
    {
        Letter letter = new Letter("A");
        String[] grades = new String[5];

        grades[0] = "A";
        grades[1] = "B";

        Student student = new Student("Sahas", grades);

        letter.print();
        student.print();
    }
}
