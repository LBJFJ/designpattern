package composite.sample01.leaf;

import composite.sample01.component.MyElement;

public class Apple extends MyElement {
    @Override
    public void eat() {
        System.out.println("吃苹果！");
    }
}
