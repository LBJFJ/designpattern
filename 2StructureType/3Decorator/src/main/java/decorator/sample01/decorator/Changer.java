package decorator.sample01.decorator;

import decorator.sample01.components.Transform;

// Decorator: 抽象装饰类 实现并扫有 Component的一个接口对象
public class Changer implements Transform {
    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }
}
