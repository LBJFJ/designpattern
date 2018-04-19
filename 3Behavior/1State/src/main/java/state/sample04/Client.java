package state.sample04;

class Client {
    public static void main(String args[]) {
        Switch s1 = new Switch("开关1");
        Switch s2 = new Switch("开关2");
        
        System.out.println("-----------Phrase 1---------------");
        s1.on();
        s2.on();

        System.out.println("-----------Phrase 2---------------");
        s1.off();
        s2.off();

        System.out.println("-----------Phrase 3---------------");
        s2.on();
        s1.on();
    }
}
