package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
题目：
定义打印集合元素，使用{}括起来，用@分割元素
参照：{元素@元素@元素}

 */
public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("张三丰");
        lista.add("宋远桥");
        lista.add("张无忌");
        lista.add("张翠山");
        System.out.println(lista);

        printArrayList(lista);

    }

    public static void printArrayList(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            if (i == 0){
                System.out.print("{" + list.get(i) + "@");
            }else if(i > 0 && i < list.size() - 1){
                System.out.print(list.get(i) + "@");
            }else{
                System.out.print(list.get(i) + "}");
            }
        }
    }

}
