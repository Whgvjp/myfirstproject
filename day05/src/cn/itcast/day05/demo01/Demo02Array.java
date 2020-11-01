package cn.itcast.day05.demo01;

/*
动态初始化（指定长度）：在创建数组的时候，直接指定数组当中的数据元素个数。
静态初始化（指定内容）：在创建数组的时候，不直接指定数据个数多少，而是直接将具体的数据内容进行指定
数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，....};
 */
public class Demo02Array {
    public static void main(String[] args) {
        //直接创建一个数组，里面装int的5,15,25
        int[] arrayA = new int[]{5,15,25};

        String[] arrayB = new String[] {"hello","world","java"};
        //静态初始化分两步
        int[] arrayD;
        arrayD = new int[] {12,13,15};

        //动态初始化分两步
        int[] arrayC;
        arrayC = new int[5];

        //但是不能
        //int arrayE;
        //arrayE = {10,20,30}
    }
}
