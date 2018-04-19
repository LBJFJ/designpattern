package builder.sample02.product;

import java.util.Arrays;

// Product
public class Car {
    private String brand;
    private Engine engine;
    private Wheel[] wheels;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", engine=" + engine + ", wheels=" + Arrays.toString(wheels) + "]";
    }
}