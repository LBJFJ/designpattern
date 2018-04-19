package templatemethod.sample00;
class SubHookDemo extends HookDemo {
    @Override
    public void getData() {
        System.out.println("从XML配置文件中获取数据。");
    }

    @Override
    public boolean isValid() {
        return false;
    }
    
    @Override
    public void displayData() {
        System.out.println("以柱状图显示数据。");
    }

   
}