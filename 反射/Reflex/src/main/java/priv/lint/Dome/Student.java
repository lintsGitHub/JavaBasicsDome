package priv.lint.Dome;

public class Student {
    private int id;
    private String name ;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

     Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show(){
        System.out.println("hello,Show");
    }

    public String show(String name){
        System.out.println("hello" + name);
        return "This is a show method";
    }

    public void show(int id , String name){
        System.out.println("hello" + id + "-->" + name);
    }

    private void shows(){
        System.out.println("private show");
    }
}
