package decorator.sample02.application;

import decorator.sample02.components.Cipher;
import decorator.sample02.components.SimpleCipher;
import decorator.sample02.decorator.AdvancedCipher;
import decorator.sample02.decorator.ComplexCipher;

public class Client {
    public static void main(String args[]) {
        String password = "sunnyLiu"; // 明文

        Cipher sc = new SimpleCipher();
        String cpassword = sc.encrypt(password);
        System.out.println(cpassword);
        System.out.println("---------------------");

        Cipher cc = new ComplexCipher(sc);
        cpassword = cc.encrypt(password);
        System.out.println(cpassword);
        System.out.println("---------------------");

        Cipher ac = new AdvancedCipher(cc);
        cpassword = ac.encrypt(password);
        System.out.println(cpassword);
        System.out.println("---------------------");
    }
}
