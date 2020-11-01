package cn.itcast.day04.demo03;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
    }

    public static int sum(int a, int b){
        System.out.println("两个");
        return a + b;
    }
    /*
    错误示范，仅仅是返回值类型不同，不行，区分不开调用的哪个
    public static double sum(int a, int b){
        System.out.println("两个");
        return a + b + 0.0;
    }*/
    public static int sum(double a, double b){
        return (int) (a + b);
    }
    public static int sum(double a, int b){
        return (int) (a + b);
    }
    public static int sum(int a, double b){
        return (int) (a + b);
    }

    public static int sum(int a, int b, int c){
        System.out.println("三个");
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d){
        System.out.println("四个");
        return a + b + c + d;
    }

}
