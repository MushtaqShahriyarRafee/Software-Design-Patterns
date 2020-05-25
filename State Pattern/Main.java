class Main {
    public static void main(String[] args) {

        GumballMachine machine = new GumballMachine(2);

        machine.insertQuarter();
        System.out.println(machine);
        machine.turnCrank();
        System.out.println(machine);
        System.out.println();

        machine.insertQuarter();
        System.out.println(machine);
        machine.turnCrank();
        System.out.println(machine);
        System.out.println();

        machine.insertQuarter();
        System.out.println(machine);
        machine.turnCrank();
        System.out.println(machine);
        System.out.println();

        machine.refill(2);
        System.out.println();

        machine.insertQuarter();
        System.out.println(machine);
        machine.turnCrank();
        System.out.println(machine);
        System.out.println();
    }
}