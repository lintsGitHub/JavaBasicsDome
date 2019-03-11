package priv.lint.lint;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class LintTest {

    @Test
    public void ts(){
        System.out.println(Math.round(-1.5));
    }

    @Test
    public void ts1(){
//        stu stu = new stu();
//        System.out.println(stu.hashCode());
//        stu stus = new stu();
//        System.out.println(stus.hashCode());
//        System.out.println(stu.equals(stus));
//        System.out.println(stu == stus);
//        A classA = new B();
//        System.out.println(classA.a);
//        classA.fun();
//        Date date = new Date();
//        System.out.println(date.getMonth()+"aaa"+date.getDate());
//        A a = new A();
//        B b = (B) a; //报错
//        B a = (B) new A(); //报错

    }


}
class stu{
    @Override
    public int hashCode() {
        return 22;
    }


   
}


 class A {
    public int a = 0;
    public void fun(){
        System.out.println("-----A-----");
    }
}

 class B extends A {
    public int a = 1;

    public void fun() {
        System.out.println("-----B-----");
    }
}

interface c{
    final int a = 0;
}