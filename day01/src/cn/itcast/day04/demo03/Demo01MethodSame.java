package cn.itcast.day04.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        boolean b = isSame(3,33);
        System.out.println(b);
    }

    public static boolean isSame(int a,int b){

        return a == b;

    }

}
