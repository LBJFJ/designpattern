package builder.sample02.builder;

import builder.sample02.product.Car;

public abstract class CarBuilder {
    protected Car car = new Car();

    public abstract void buildBrand();

    public abstract void buildEngine();

    public abstract void buildWheels();

    public Car getCar() {
        return this.car;
    }
}
