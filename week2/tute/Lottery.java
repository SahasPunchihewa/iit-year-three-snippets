package week2.tute;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lottery
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 6) {
            numbers.add(rand.nextInt(49 -1) + 1);
        }

        System.out.println(numbers);

    }
}
