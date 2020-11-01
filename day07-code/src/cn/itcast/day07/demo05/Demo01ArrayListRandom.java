package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：生成6个1~33之间的随机整数，添加到集合，并遍历集合。

思路：
1.需要存储6个数字，创建一个集合，<Integer>
2.产生随机数，需要Random
3.用循环6次，产生6个随机数，for循环

 */
public class Demo01ArrayListRandom {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int a = r.nextInt(33) + 1;
            list.add(a);
        }
        System.out.println(list);
    }

}
