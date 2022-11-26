package week8.tute;

import java.util.Random;

class Board
{
    int ar[][];

    // creates a nxn size board
    public Board(int n)
    {
        ar = new int[n][n];
        // fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                ar[i][j] = generator.nextInt(101);
    }

    // display the contents of the board
    public void print()
    {
        for (int[] r : ar)
        { // for all rows
            for (int c : r) // for every element in current row
                System.out.print(c + " ");
            System.out.println();
        }
    }

    public Integer findMaxInRow(int row)
    {
        int max = 0;
        for (int item: ar[row])
        {
            if (item > max)
            {
                max = item;
            }
        }
        return max;
    }

    public Integer findMaxInColumn(int column)
    {
//        int max = 0;
//        for (int i=0; i< ar.)
        return 1;
    }
}
