package strategy.sample02.strategy;
public class TrainStrategy implements TravelStrategy {
    @Override
    public void travelMethod() {
        System.out.println("火车游！");
    }
}