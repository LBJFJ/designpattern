package bridge.sample01.application;

import bridge.sample01.color.Color;
import bridge.sample01.pen.Pen;
import bridge.sample01.util.XMLUtilPen;

public class Client {
    public static void main(String a[]) {
        Pen pen = (Pen) XMLUtilPen.getBean("pen");
        Color color = (Color) XMLUtilPen.getBean("color");
        
        pen.setColor(color);
        pen.draw("鲜花");
    }
}
