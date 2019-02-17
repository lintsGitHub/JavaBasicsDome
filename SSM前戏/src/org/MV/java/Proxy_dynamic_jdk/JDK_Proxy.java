package org.MV.java.Proxy_dynamic_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDK_Proxy {
    public static void main(String[] args) {

    ShopService shop = new ShopServiceImpl();
        ShopService service = (ShopService) Proxy.newProxyInstance(
                shop.getClass().getClassLoader(),
                shop.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String invoke = (String) method.invoke(shop, args);
                        return invoke.toLowerCase();
                    }
                }
        );
        System.out.println(service.sendHello());
        System.out.println(service.sendString("HHHHHHHHH"));

    }

}
