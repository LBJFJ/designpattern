package factorymethod.sample01.application;

import factorymethod.sample01.factory.TVFactory;
import factorymethod.sample01.tv.TV;
import factorymethod.sample01.util.XMLUtil;

public class Client {
    public static void main(String args[]) {
        try {
            TVFactory factory = (TVFactory) XMLUtil.getBean();
            TV tv = factory.produceTV();
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
