package week3.tute;

public class VendingMachine
{
    private Integer noOfTokens;
    private Integer noOfCans;

    public VendingMachine()
    {
        noOfCans = 0;
        noOfTokens = 0;
    }

    public void fillUp(Integer cans) {
        noOfCans += cans;
    }

    public void insertToken() {
        noOfTokens += 1;
    }

    public void getCans(Integer cans) {
        if (noOfCans < cans) {
            System.out.println("Insufficient cans");
        } else if (cans > noOfTokens) {
            System.out.println("Insufficient tokens");
        } else {
            noOfTokens -= cans;
            noOfCans -= cans;
        }
    }

    public Integer getCanCount() {
        return noOfCans;
    }

    public Integer getTokenCount() {
        return noOfTokens;
    }
}
