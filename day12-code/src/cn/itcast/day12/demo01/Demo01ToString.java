package cn.itcast.day12.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
java.long.Object
类 Object 是类层次结构的根（父）类。
每个类(Person,Student...)都是用 Object 作为超（父）类。
所有对象（包括数组）都实现这个类的方法。
 */
public class Demo01ToString {
    public static void main(String[] args) {

        Person person = new Person("张三",18);
        String s = person.toString();
        System.out.println(s);
        //直接打印对象的名字，其实就是调用对象的toString方法。
        System.out.println(person);
        //看一个类是否重写了toString方法，直接打印这个类的对象即可

        Random r = new Random();
        System.out.println(r);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);//重写了

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);

    }
}
