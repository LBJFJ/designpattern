package composite.sample01.composite;

import java.util.ArrayList;
import java.util.List;
import composite.sample01.component.MyElement;

public class Plate extends MyElement {
    private List<MyElement> list = new ArrayList<>();

    public void add(MyElement element) {
        list.add(element);
    }

    public void delete(MyElement element) {
        list.remove(element);
    }

    @Override
    public void eat() {
        for (Object object : list) {
            ((MyElement) object).eat();
        }
    }
}
