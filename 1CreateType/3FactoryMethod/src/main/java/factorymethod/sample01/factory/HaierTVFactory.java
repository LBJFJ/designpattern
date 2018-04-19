package factorymethod.sample01.factory;

import factorymethod.sample01.tv.HaierTV;
import factorymethod.sample01.tv.TV;

public class HaierTVFactory implements TVFactory {
    public TV produceTV() {
        System.out.println("海尔电视机工厂生产海尔电视机。");
        return new HaierTV();
    }
}
