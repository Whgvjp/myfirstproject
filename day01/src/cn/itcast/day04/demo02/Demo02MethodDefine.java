package cn.itcast.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        int res = sum(2,4);
        System.out.println(sum(10,3));

    }
    public static int sum (int a, int b){
        int result = a + b;
        return result;
    }
}
