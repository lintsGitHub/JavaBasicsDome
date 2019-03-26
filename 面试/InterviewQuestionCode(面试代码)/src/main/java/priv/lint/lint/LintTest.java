package priv.lint.lint;

import org.junit.jupiter.api.Test;
import priv.lint.Tow.Student;

import java.util.Date;
import java.util.StringJoiner;

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

//        StringJoiner构造函数传一个分隔符
//        如果StringJoiner构造函数传三个参数：1，分隔符 2，前缀 3，后缀
//        StringJoiner stringJoiner = new StringJoiner(",","aa","cc");
//        stringJoiner.add("word").add("aaaa");
//        System.out.println(stringJoiner.toString());
//        String hello = new String("hello");
//        String hello1 = new String("hello");
//        System.out.println(hello.hashCode());
//        System.out.println(hello1.hashCode());
        Student student = new Student(23,"hells");
        Student student2 = new Student(23,"hells");
        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student.equals(student2));

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