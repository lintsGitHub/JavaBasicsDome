package 静态代理模式;
//代理类
public class ServiceProxy implements InfoService {
    private SerciceImpl sercice;
    @Override
    public String printHelloWord() {
        System.out.println("进入到ServiceProxy中的printHelloWord方法里");
        //创建目标类对象
        sercice = new SerciceImpl();
//        代理类调用目标类的方法
        String s = sercice.printHelloWord();
//        进行一些业务上的处理和增强
        return s.toLowerCase();
    }
}
