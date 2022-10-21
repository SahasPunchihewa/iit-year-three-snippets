package week3.tute;

public class River
{

    public static void main(String[] args) {
        String greeting = "Hello, World!";
        System.out.println(greeting.length());

        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        String smallRiver = bigRiver.toLowerCase();

        System.out.println(bigRiver + "\n" + smallRiver);

        String originalRiver = smallRiver.substring(0, 1).toUpperCase().concat(smallRiver.substring(1));

        System.out.println(originalRiver);
    }
}
