package templatemethod.sample00;
class Client {
    public static void main(String a[]) {
        HookDemo hd = new SubHookDemo();
        hd.process();
    }
}