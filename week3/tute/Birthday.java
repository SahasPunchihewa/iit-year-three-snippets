package week3.tute;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Birthday
{

    public static Integer getRandomDay() {
        Random random = new Random();
        return random.nextInt(365 - 1) + 1;
    }

    public static Integer findMatchingBirthdays () {
        List<Integer> birthdays = new ArrayList<>();
        birthdays.add(getRandomDay());

        while (true) {
            Integer nextBirthday = getRandomDay();

            birthdays.add(nextBirthday);

            if (Objects.equals(birthdays.get(0), nextBirthday)) {
                break;
            }
        }
        return birthdays.size();
    }

    public static void main(String[] args)
    {
        int total = 0;
        for (int i=0; i<3; i++) {
            Integer noOfPeople = findMatchingBirthdays();
            total += noOfPeople;
            System.out.println("No of people: " + noOfPeople);
        }

        System.out.println("Average people: " + total /3);
    }
}
