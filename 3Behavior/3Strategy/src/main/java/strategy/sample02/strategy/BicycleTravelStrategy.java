package strategy.sample02.strategy;
public class BicycleTravelStrategy implements TravelStrategy {
    @Override
    public void travelMethod() {
        System.out.println("自行车游！");
    }
}