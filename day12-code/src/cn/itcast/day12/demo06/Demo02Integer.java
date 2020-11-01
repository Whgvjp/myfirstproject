package cn.itcast.day12.demo06;

import java.util.ArrayList;

/*
基本类型和包装类型自动转换。JDK 1.5 之后就有了
 */
public class Demo02Integer {
    public static void main(String[] args) {
        //直接int赋值给包装类
        Integer in = 1; // 相当于 Integer in = new Integer(1);
        //隐藏了自动拆箱
        in = in + 2;    //相当于 in.intValue() + 2,然后又自动装箱

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);    //自动装箱

        int a = list.get(0); // 自动拆箱


    }
}
