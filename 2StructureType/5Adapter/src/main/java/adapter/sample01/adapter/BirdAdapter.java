package adapter.sample01.adapter;

import adapter.sample01.adaptee.Bird;
import adapter.sample01.target.Robot;

// Class Adapter
public class BirdAdapter extends Bird implements Robot {
    public void cry() {
        System.out.print("机器人模仿：");
        super.tweedle();
    }

    public void move() {
        System.out.print("机器人模仿：");
        super.fly();
    }
}
