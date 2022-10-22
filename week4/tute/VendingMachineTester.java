package week4.tute;

import week3.tute.VendingMachine;

public class VendingMachineTester
{
    public static void main(String[] args)
    {
        week3.tute.VendingMachine machine = new VendingMachine();

        machine.fillUp(10); // fill up with ten cans
        machine.insertToken();
        machine.insertToken();
        System.out.print("Token count = ");
        System.out.println(machine.getTokenCount());
        System.out.print("Can count = ");
        System.out.println(machine.getCanCount());
    }
}
