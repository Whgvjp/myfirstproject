package cn.itcast.day12.demo7;

import java.util.ArrayList;
import java.util.Collection;

/*
java.util.collection接口
    所有单列集合的最顶层的接口，里面定义了所有单列集合共性的方法
    任意的单列集合都可可以使用Collection接口中的方法
 */
public class Demo01Collection {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);   // 重写了toString方法

        boolean b1 = coll.add("张三");
        System.out.println("b1:" + b1);
        System.out.println(coll);
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);
        coll.remove("赵六");
        System.out.println(coll);
        System.out.println(coll.contains("赵四"));
        System.out.println(coll.isEmpty());
        System.out.println(coll.size());
        Object[] strs = coll.toArray();
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }

}
