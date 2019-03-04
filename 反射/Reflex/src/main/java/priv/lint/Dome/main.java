package priv.lint.Dome;


/*
* 获取Class文件对象的方式：
* 1，Object类的getClass()方法
* 2，数据类型的静态属性Class
* 3，Class类中的静态方法
*      public static Class forName (String name)
*  name 参数带的是全路径
*
* 一般我们使用哪种呢？
*   A, 我们自己使用  任意一种，建议第二种，因为第二种比较简单
*   B,  开发使用    第三种     因为第三种是一个字符串，而不是一个具体的类名，这样我们就可以把它配置到配置文件中去了
* */
public class main {
    public static void main(String[] args) throws ClassNotFoundException {
//        方式一：
        Student student = new Student();
        Class aClass = student.getClass();

        Student student1 = new Student();
        Class aClass1 = student1.getClass();

        System.out.println(student == student1); //false
        System.out.println(aClass == aClass1);  // true


//        方式二：
        Class<Student> studentClass = Student.class;
        System.out.println(aClass == studentClass); //true

//        方式三：
        Class student2 = Class.forName("priv.lint.Dome.Student");
        System.out.println(aClass == student2);
    }
}
