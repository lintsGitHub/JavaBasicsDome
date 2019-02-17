package 静态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 动态代理模式
* */
public class DynamicProxy {
    public static void main(String[] args) {

    InfoService infoService = new SerciceImpl();
    InfoService service = (InfoService) Proxy.newProxyInstance(
            infoService.getClass().getClassLoader(),
            infoService.getClass().getInterfaces(),
            (proxy, method, prt) -> {
                Object invoke = method.invoke(infoService, prt);
                String res = String.valueOf(invoke).toLowerCase();
                return res;
            }
    );
        String s = service.printHelloWord();
        System.out.println(s);
    }

}
