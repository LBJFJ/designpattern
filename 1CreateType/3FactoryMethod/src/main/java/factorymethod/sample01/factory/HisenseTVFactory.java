package factorymethod.sample01.factory;

import factorymethod.sample01.tv.HisenseTV;
import factorymethod.sample01.tv.TV;

public class HisenseTVFactory implements TVFactory {
    public TV produceTV() {
        System.out.println("海信电视机工厂生产海信电视机。");
        return new HisenseTV();
    }
}
