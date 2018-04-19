package decorator.sample01.application;

import decorator.sample01.components.Car;
import decorator.sample01.components.Transform;
import decorator.sample01.decorator.Airplane;
import decorator.sample01.decorator.Robot;

public class Client {
    public static void main(String args[]) {
        Transform camaro = new Car();
        camaro.move();
        
        System.out.println("----------用飞机来装饰-------------------");
        Airplane bumblebee = new Airplane(camaro);
        bumblebee.move();
        bumblebee.fly();
        
        System.out.println("----------再用机器人来装饰-------------------");
        Robot robot = new Robot(camaro);
        robot.move();
        robot.say();
    }
}
