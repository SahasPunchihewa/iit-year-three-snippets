package week2.tute;

public class Main
{
    public static void exercise1() {
        System.out.println("Welcome to Online Learning!\n\nPlease virus go away!");
    }

    public static void exercise3() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void exercise4() {
        int i = 0;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i += 1;
        }
    }

    public static void main(String[] args)
    {
        exercise1();
        System.out.println();
        exercise3();
        System.out.println();
        exercise4();
    }
}
