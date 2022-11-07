package week7.tute;

public class CalcManager
{
    public static Boolean isEven(int n)
    {
        return n % 2 == 0;
    }

    public static Integer cube(int n)
    {
        return (int)Math.pow(n, 3);
    }

    public static Double add(double n1, double n2, double n3)
    {
        return n1 + n2 + n3;
    }

    public static void main(String[] args)
    {
        System.out.println(isEven(4));
        System.out.println(cube(4));
        System.out.println(add(4.0, 6.8, 8.9));
    }
}
