package cn.itcast.day08.demo03;

public class MyClass {

    int num;                //成员变量
    static int numStatic;   //静态变量

    public void method(){
        System.out.println("这是一个成员方法。");
    }

    public static void methodStatic(){
        System.out.println("这是一个静态方法。");
        //静态不能直接访问非静态；
        //System.out.println(num);
        System.out.println(numStatic);
        //静态方法不能用this
        //System.out.println(this);
    }

}
