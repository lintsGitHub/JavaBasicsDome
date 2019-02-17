package 静态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 需求是不修改SerciceImpl的情况下将helloword全改为小写，
* 也不能在main方法中进行方法转换
*
* 这个时候就体现出代理模式的好处了,
* 也可以体现出使用接口来处理的好处
*
* */
public class MyTest {
    public static void main(String[] args) {

        /*InfoService infoService = new ServiceProxy();
        System.out.println(infoService.printHelloWord());*/
        InfoService infoService = new SerciceImpl();
        InfoService service = (InfoService) Proxy.newProxyInstance(
                infoService.getClass().getClassLoader(),
                infoService.getClass().getInterfaces(),
                (proxy, method, args1) -> {
                    method.invoke(infoService, args1);
                    return null;
                }
        );
    }
}
