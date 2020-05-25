import java.util.Random;

class HasQuarterState implements State {

    GumballMachine machine;

    HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    public void insertQuarter() {
        System.out.println(this + ": You have already inserted a quarter. Please Wait");
    }

    public void ejectQuarter() {
        System.out.println(this + ": Ejecting quarter");
        machine.setState(machine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println(this + ": Turning crank");
        Random rand = new Random();
        int n = rand.nextInt(3);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> " + n);
        if (machine.count >= 2 && n == 2)
            machine.setState(machine.getWinnerState());
        else
            machine.setState(machine.getSoldState());
    }

    public void dispense() {
        System.out.println(this + ": " + "No gumball dispensed");
    }


    public String toString() {
        return "HAS_QUARTER";
    }
}