package builder.sample02.builder;

import builder.sample02.product.Engine;
import builder.sample02.product.Wheel;

public class BMWBuilder extends CarBuilder {

    @Override
    public void buildBrand() {
        car.setBrand("BMW");

    }

    @Override
    public void buildEngine() {
        car.setEngine(new Engine("Engine X"));

    }

    @Override
    public void buildWheels() {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel("Good Year");
        }
        car.setWheels(wheels);
    }

}
