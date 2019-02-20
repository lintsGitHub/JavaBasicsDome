package priv.lint.Tow;

import java.util.LinkedList;

/*
* LinkedList 就是一个双向链表 ，现对于List就体现出功能的一个加强
* 这个类提供了链表的一个操作
* 这个类实现了list和deque接口
* */
public class LinkedListDome {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Student(i, "hello"));
        }
        list.push(new Student(2, "aaa"));
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
