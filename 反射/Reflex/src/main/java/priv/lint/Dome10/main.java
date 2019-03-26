package priv.lint.Dome10;

import java.lang.reflect.Proxy;

/*
* 使用JDK的一个动态代理做一个例子
* 将User这个实现类进行一个添加权限验证和一个记录日志
* */
public class main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserImpl();
        userDAO.add();
        System.out.println("==============");

        //对User做一个代理对象
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userDAO);
        UserDAO proxy = (UserDAO) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), userDAO.getClass().getInterfaces(), myInvocationHandler);
        proxy.add();
    }
}
