package strategy.sample02.context;

import strategy.sample02.strategy.TravelStrategy;

public class MyContext {
    private TravelStrategy ts;

    public MyContext(TravelStrategy ts) {
        this.ts = ts;
    }

    public void travelMethod() {
        ts.travelMethod();
    }
}