package strategy.sample02.strategy;
public class SelfTravelStrategy implements TravelStrategy {
    @Override
    public void travelMethod() {
        System.out.println("自驾游！");
    }
}