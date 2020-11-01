package cn.itcast.day06.demo01;
/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。

1.导包，也就是需要指出使用的类，在什么位置。
import cn.itcast.day06.demo01.Student;
对于和当前类属于同一个包的情况，可以忽略导包语句不写。

2.创建，格式：
类名称  对象名 = new 类名称();
Student stu = new Student();

3.使用，分为两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名(参数)
(也就是想用谁，就用对象名.谁。)

注意事项：
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
 */
public class Demo02Student {

    public static void main(String[] args) {

        //1.导包，在同一个包，不需要写
        //2.创建格式：
        Student stu = new Student();
        //3.使用其中的成员变量
        System.out.println(stu.name);   // null
        System.out.println(stu.age);    // 0
        System.out.println("=============");
        //改变对象当中的成员变量数值内容
        //将右侧的字符串，赋值交给stu对象当中的name成员变量
        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("==============");

        //4.使用成员方法
        stu.eat();
        stu.sleep();
        stu.study();

    }

}
