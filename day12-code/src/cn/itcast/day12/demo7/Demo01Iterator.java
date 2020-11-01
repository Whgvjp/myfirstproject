package cn.itcast.day12.demo7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
  java.util.Iterator 接口：迭代器（对集合进行遍历）
   boolean hasNext() 如果仍有元素可以迭代，则返回 true。
   E next() 返回迭代的下一个元素。

 */
public class Demo01Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾弗森");
        Iterator<String> it = coll.iterator();
        boolean b = it.hasNext();
        System.out.println(b);

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
