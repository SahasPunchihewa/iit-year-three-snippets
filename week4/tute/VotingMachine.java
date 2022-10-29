package week4.tute;

import java.util.Random;

public class VotingMachine
{
    private Integer labourVotes;
    private Integer conservativeVotes;

    public VotingMachine()
    {
        labourVotes = 0;
        conservativeVotes = 0;
    }

    public void voteForLabour()
    {
        labourVotes += new Random().nextInt(10);
    }

    public void voteForConservative()
    {
        conservativeVotes ++;
    }

    public void clearState()
    {
        labourVotes = 0;
        conservativeVotes = 0;
    }

    public void getNumberOfVotes()
    {
        System.out.println("Labour votes: " + labourVotes);
        System.out.println("Conservative votes: " + conservativeVotes);
    }
}
