public class Milk extends Condiments {
    Milk(Beverage beverage){
        this.beverage = beverage;
        description = beverage.getDescription() + ", Milk";
    }
    @Override
    int getCost() {
        return beverage.getCost() + 15;
    }
}
