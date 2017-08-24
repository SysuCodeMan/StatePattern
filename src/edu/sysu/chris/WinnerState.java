package edu.sysu.chris;

/*
Created by ChrisChan on 2017/8/24.
*/
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("You can't insert a quarter");
    }

    @Override
    public void ejectQuater() {
        System.out.println("You can't eject a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn crank");
    }

    @Override
    public void dispense() {
        System.out.println("You 're a Winner! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
