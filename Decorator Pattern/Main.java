public class Main {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Sugar(beverage);
        beverage = new Milk(beverage);
        System.out.println("Description: " + beverage.getDescription() + ".");
        System.out.println("Total Cost: " + beverage.getCost() + " $");
    }
}
