package strategy.sample02.application;

import strategy.sample02.XMLUtil;
import strategy.sample02.context.MyContext;
import strategy.sample02.strategy.TravelStrategy;

class Client {
    public static void main(String args[]) {
        MyContext mc = new MyContext((TravelStrategy) XMLUtil.getBean());
        mc.travelMethod();
    }
}