package adapter.sample02.adapter;

import adapter.sample02.adaptee.Caesar;
import adapter.sample02.target.DataOperation;

// Object Adapter
public class CipherAdapter extends DataOperation {
    private Caesar cipher;

    public CipherAdapter() {
        cipher = new Caesar();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}
