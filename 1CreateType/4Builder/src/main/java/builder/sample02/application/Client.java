package builder.sample02.application;

import builder.sample02.builder.BMWBuilder;
import builder.sample02.builder.QQBuilder;
import builder.sample02.director.CarDirector;
import builder.sample02.product.Car;

public class Client {

    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        
        director.setCarBuilder(new BMWBuilder());
        Car car1 = director.build();
        System.out.println(car1.toString());

        director.setCarBuilder(new QQBuilder());
        Car car2 = director.build();
        System.out.println(car2.toString());
    }

}
