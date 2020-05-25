public class Sugar extends Condiments {
    Sugar(Beverage beverage){
        this.beverage = beverage;
        description = beverage.getDescription() + ", Sugar";
    }
    @Override
    int getCost() {
        return beverage.getCost() + 20;
    }
}
