package 静态代理模式;
//目标类
public class SerciceImpl implements InfoService {

    public String printHelloWord() {
        System.out.println("进入到ServiceImpl类");
        return "HelloWord";
    }
}
