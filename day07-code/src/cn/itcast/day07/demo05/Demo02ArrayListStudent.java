package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class Demo02ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        Student one = new Student("洪七公",20);
        Student two = new Student("欧阳锋",21);
        Student three = new Student("黄药师",22);
        Student four = new Student("段智兴",23);

        listStudent.add(one);
        listStudent.add(two);
        listStudent.add(three);
        listStudent.add(four);

        for (int i = 0; i < listStudent.size(); i++) {
            Student stu = listStudent.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄" + stu.getAge());
        }

    }

}
