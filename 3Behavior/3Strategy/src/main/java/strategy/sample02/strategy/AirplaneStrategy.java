package strategy.sample02.strategy;
public class AirplaneStrategy implements TravelStrategy {
    @Override
    public void travelMethod() {
        System.out.println("飞机游！");
    }
}