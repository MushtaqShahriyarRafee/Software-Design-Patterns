public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(this + ": Sorry, we are out of gum.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println(this + ": Sorry, you can't eject unless you inserted one.");
    }

    @Override
    public void turnCrank() {
        System.out.println(this + ": Sorry, we are out of gum.");
    }

    @Override
    public void dispense() {
    }

    public String toString() {
        return "SOLD_OUT";
    }
}
