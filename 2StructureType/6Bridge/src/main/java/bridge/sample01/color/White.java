package bridge.sample01.color;

public class White implements Color {
    public void bepaint(String penType, String name) {
        System.out.println(penType + "白色的" + name + ".");
    }
}