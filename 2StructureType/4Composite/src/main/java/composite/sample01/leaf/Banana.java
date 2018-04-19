package composite.sample01.leaf;

import composite.sample01.component.MyElement;

public class Banana extends MyElement {
    @Override
    public void eat() {
        System.out.println("吃香蕉！");
    }
}
