package observer.sample03.observer;

import observer.sample03.subject.AllyControlCenter;

// 抽象观察类
public interface Observer {
    public String getName();

    public void setName(String name);

    public void help(); // 声明支援盟友方法

    public void beAttacked(AllyControlCenter acc); // 声明遭受攻击方法
}