package adapter.sample01.application;

import adapter.sample01.target.Robot;
import adapter.sample01.util.XMLUtil;

public class Client {
    public static void main(String args[]) {
        Robot robot = (Robot) XMLUtil.getBean();
        robot.cry();
        robot.move();
    }
}
