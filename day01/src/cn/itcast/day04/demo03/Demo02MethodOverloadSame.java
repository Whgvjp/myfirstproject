package cn.itcast.day04.demo03;

public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame(10,10));
        System.out.println(isSame((short)12,(short)13));
    }

    public static boolean isSame(byte a, byte b){
        System.out.println("byte");
        return a == b;
    }
    public static boolean isSame(short a, short b){
        System.out.println("short");
        return a == b;
    }
    public static boolean isSame(int a, int b){
        System.out.println("int");
        return a == b;
    }
    public static boolean isSame(long a, long b){
        System.out.println("long");
        return a == b;
    }

}
