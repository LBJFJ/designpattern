package observer.sample03.application;

import observer.sample03.observer.Player;
import observer.sample03.subject.AllyControlCenter;
import observer.sample03.subject.ConcreteAllyControlCenter;

public class Client {
    public static void main(String args[]) {
        // 定义观察目标对象
        AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");
        
        //添加观察者
        acc.join(new Player("杨过"));
        acc.join(new Player("令狐冲"));
        acc.join(new Player("张无忌"));
        acc.join(new Player("段誉"));

        // 某成员遭受攻击
        new Player("杨过").beAttacked(acc);
    }
}