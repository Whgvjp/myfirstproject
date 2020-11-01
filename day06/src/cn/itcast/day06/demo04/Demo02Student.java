package cn.itcast.day06.demo04;

public class Demo02Student {

    public static void main(String[] args) {

        Student stu = new Student();
        Student stu2 = new Student("赵丽颖",20);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        stu2.setAge(21);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());

    }

}
