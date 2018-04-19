package builder.sample02.director;

import builder.sample02.builder.CarBuilder;
import builder.sample02.product.Car;

public class CarDirector {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car build() {
        carBuilder.buildBrand();
        carBuilder.buildEngine();
        carBuilder.buildWheels();

        return carBuilder.getCar();
    }
}
