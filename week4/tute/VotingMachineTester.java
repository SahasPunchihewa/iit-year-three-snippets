package week4.tute;

public class VotingMachineTester
{
    public static void main(String[] args)
    {
        VotingMachine votingMachine = new VotingMachine();

        votingMachine.voteForLabour();
        votingMachine.voteForConservative();

        votingMachine.getNumberOfVotes();

        votingMachine.voteForLabour();

        votingMachine.voteForConservative();

        votingMachine.getNumberOfVotes();

        votingMachine.clearState();

        votingMachine.voteForLabour();

        votingMachine.getNumberOfVotes();
    }
}
