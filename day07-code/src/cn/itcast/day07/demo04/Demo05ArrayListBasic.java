package cn.itcast.day07.demo04;

import java.util.ArrayList;
/*
如果希望向集合ArrayList当中存储基本数据类型，必须使用基本类型对应的“包装类”。
基本类型    包装类（引用类型，包装类都位于java.lang包下）
byte        Byte
short       Short
int         Integer         【特殊】
long        Long
float       Float
double      Double
char        Character       【特殊】
boolean     Boolean

从JDK 1.5+开始，支持自动装箱、自动拆箱。

自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */
public class Demo05ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        //错误写法！泛型只能是引用类型，不能使基本类型
        //ArrayList<int> listB = new ArrayList<int>();
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        listB.add(300);
        System.out.println(listB);
        int a = listB.get(1);
        System.out.println(a);
        System.out.println(listB);
    }

}
