package simplefactory.sample01.application;

import simplefactory.sample01.factory.TVFactory;
import simplefactory.sample01.tv.TV;
import simplefactory.sample01.util.XMLUtilTV;

public class Client {
    public static void main(String args[]) {
        try {
            TV tv;
            String brandName = XMLUtilTV.getBrandName();
            
            tv = TVFactory.produceTV(brandName);
            
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
