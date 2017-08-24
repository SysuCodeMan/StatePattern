package edu.sysu.chris;

/*
Created by ChrisChan on 2017/8/24.
*/
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.trunCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.trunCrank();
        gumballMachine.insertQuarter();
        gumballMachine.trunCrank();

        System.out.println(gumballMachine);

    }
}
