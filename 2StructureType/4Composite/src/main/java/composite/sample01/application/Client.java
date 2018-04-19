package composite.sample01.application;

import composite.sample01.composite.Plate;
import composite.sample01.leaf.Apple;
import composite.sample01.leaf.Banana;
import composite.sample01.leaf.Pear;

public class Client {
    public static void main(String a[]) {
        Plate plate1 = new Plate();
        plate1.add(new Apple());
        plate1.add(new Pear());

        Plate plate2 = new Plate();
        plate2.add(new Banana());
        plate2.add(new Banana());

        Plate plate3 = new Plate();
        plate3.add(plate1);
        plate3.add(plate2);
        plate3.add(new Apple());

        System.out.println("---------吃盘子1中的水果--------------");
        plate1.eat();
        
        System.out.println("---------吃盘子2中的水果--------------");
        plate2.eat();
        
        System.out.println("---------吃盘子3中的水果--------------");
        plate3.eat();
    }
}
