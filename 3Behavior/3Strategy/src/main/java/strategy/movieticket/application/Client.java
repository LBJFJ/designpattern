package strategy.movieticket.application;

import strategy.movieticket.context.MovieTicket;
import strategy.movieticket.strategy.Discount;
import strategy.movieticket.util.XMLUtil;

class Client {
    public static void main(String args[]) {
        MovieTicket mt = new MovieTicket();
        mt.setPrice(60.0);
        System.out.println("原始价为：" + 60.0);
        
        System.out.println("---------------------------------");

        Discount discount = (Discount) XMLUtil.getBean(); // 读取配置文件并反射生成具体折扣对象
        mt.setDiscount(discount); // 注入折扣对象
        System.out.println("折后价为：" + mt.getPrice());
    }
}