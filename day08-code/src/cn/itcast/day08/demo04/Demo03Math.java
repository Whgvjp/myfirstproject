package cn.itcast.day08.demo04;

/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs(double num): 获取绝对值。
public static double ceil(double num): 向上取整。
public static double floor(double num): 向下取整。
public static long round(double num): 四舍五入。
 */
public class Demo03Math {

    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("=================");

        System.out.println(Math.ceil(3.001));
        System.out.println(Math.floor(4.9999));
        System.out.println(Math.round(6.49));
        System.out.println(Math.round(6.501));

    }

}
