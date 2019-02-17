package org.MV.java.Proxy_dynamic_jdk;

public class ShopServiceImpl implements ShopService {
    @Override
    public String sendHello() {
        return "Hello";
    }

    @Override
    public String sendString(String s) {
        return s;
    }
}
