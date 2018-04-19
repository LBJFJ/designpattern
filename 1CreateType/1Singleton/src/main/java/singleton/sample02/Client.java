package singleton.sample02;

public class Client {
    public static void main(String a[]) {
        try {
            PrintSpoolerSingleton ps1 = PrintSpoolerSingleton.getInstance();
            ps1.manageJobs();
        } catch (PrintSpoolerException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("--------------------------");
        
        try {
            PrintSpoolerSingleton ps2 = PrintSpoolerSingleton.getInstance();
            ps2.manageJobs();
        } catch (PrintSpoolerException e) {
            System.out.println(e.getMessage());
        }
    }
}
