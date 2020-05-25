class NoQuarterState implements State {

    GumballMachine machine;

    NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(this + ": Inserting quarter");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println(this + ": You have not inserted a quarter. Please insert one.");
    }

    @Override
    public void turnCrank() {
        System.out.println(this + ": You have not inserted a quarter. Please insert one.");
    }

    @Override
    public void dispense() {
        System.out.println(this + ": " + "No gumball dispensed");
    }

    public String toString() {
        return "NO_QUARTER";
    }
}
