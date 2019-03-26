package priv.lint.Dome10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target; //目标对象

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /*
    * Object invoke(Object proxy,
              方法 method,
              Object[] args)
       throws Throwable处理代理实例上的方法调用并返回结果。 当在与之关联的代理实例上调用方法时，将在调用处理程序中调用此方法。
    参数
    proxy - 调用该方法的代理实例
    method -所述方法对应于调用代理实例上的接口方法的实例。 方法对象的声明类将是该方法声明的接口，它可以是代理类继承该方法的代理接口的超级接口。
    args -包含的方法调用传递代理实例的参数值的对象的阵列，或null如果接口方法没有参数。 原始类型的参数包含在适当的原始包装器类的实例中，例如java.lang.Integer或java.lang.Boolean 。
    结果
    从代理实例上的方法调用返回的值。 如果接口方法的声明返回类型是原始类型，则此方法返回的值必须是对应的基本包装类的实例; 否则，它必须是可声明返回类型的类型。 如果此方法返回的值是null和接口方法的返回类型是基本类型，那么NullPointerException将由代理实例的方法调用抛出。 如上所述，如果此方法返回的值，否则不会与接口方法的声明的返回类型兼容，一个ClassCastException将代理实例的方法调用将抛出。
    异常
    Throwable - 从代理实例上的方法调用抛出的异常。 异常类型必须可以分配给接口方法的throws子句中声明的任何异常类型java.lang.RuntimeException检查的异常类型java.lang.RuntimeException或java.lang.Error 。 如果检查的异常是由这种方法是不分配给任何的中声明的异常类型throws接口方法的子句，则一个UndeclaredThrowableException包含有由该方法抛出的异常将通过在方法调用抛出代理实例。
    * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限验证");
        Object invoke = method.invoke(target, args); // 使用一个变量来接收方法的一个返回值
        System.out.println("日志记录");
        return invoke;
    }
}
