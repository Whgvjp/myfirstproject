package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选。


 */
public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> listi = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int a = r.nextInt(99) + 1;
            listi.add(a);
        }
        System.out.println(listi);
        ArrayList<Integer> slist = new ArrayList<>();
        slist = returnArrayList(listi);
        System.out.println(slist);
        System.out.println(slist.size());
    }

    public static ArrayList<Integer> returnArrayList(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            if(temp % 2 == 0){
                list1.add(temp);
            }
        }
        return list1;
    }

}
