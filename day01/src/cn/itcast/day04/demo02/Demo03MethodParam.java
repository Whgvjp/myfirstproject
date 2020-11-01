package cn.itcast.day04.demo02;

/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数。
无参数：小括号当中留空，一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数。

 */
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(10,20);
        System.out.println("=====================");
        method2();
    }
    //两个数字，相乘
    public static void method1(int a,int b){
        int result = a * b;
        System.out.println("结果是： " + result);
    }
    //例如打印输出固定10次文本字符串
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello" + i);
        }
    }
}
