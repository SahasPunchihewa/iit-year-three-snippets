package week3.tute;

public class ConcatTester
{
    public static void main(String[] args)
    {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        String concat = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(article).concat(" ").concat(animal2);
        String plus = article + " " + animal1 + " " + action + " " + article + " " + animal2;

        System.out.println(concat + "\n" + plus);

        System.out.println(concat.length());
    }
}