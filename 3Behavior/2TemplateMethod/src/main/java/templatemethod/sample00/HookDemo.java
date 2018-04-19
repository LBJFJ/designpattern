package templatemethod.sample00;

public abstract class HookDemo {
    public void process() {
        getData();
        
        if (isValid()) {
            convertData();
        }
        
        displayData();
    }

    public abstract void getData();

    public boolean isValid() {
        return true;
    }

    public void convertData() {
        System.out.println("通用的数据转换操作。");
    }

    public abstract void displayData();
}
