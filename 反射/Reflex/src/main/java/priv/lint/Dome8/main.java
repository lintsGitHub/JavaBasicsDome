package priv.lint.Dome8;

public class main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student();
        Tool tool = new Tool();
        tool.setProperty(student,"name","李雷");
        tool.setProperty(student,"age",23);
        System.out.println(student);
    }
}

class Student{
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}