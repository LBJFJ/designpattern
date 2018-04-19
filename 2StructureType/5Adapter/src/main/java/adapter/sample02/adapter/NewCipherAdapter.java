package adapter.sample02.adapter;

import adapter.sample02.adaptee.NewCipher;
import adapter.sample02.target.DataOperation;

// Object Adapter
public class NewCipherAdapter extends DataOperation {
    private NewCipher cipher;

    public NewCipherAdapter() {
        cipher = new NewCipher();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}


