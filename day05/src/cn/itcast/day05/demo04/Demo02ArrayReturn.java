package cn.itcast.day05.demo04;
/*
一个方法可以有多个参数，但只有一个返回值
如果希望返回多个数据，怎么办？
使用一个数组作为返回值类型即可。
 */
public class Demo02ArrayReturn {

    public static void main(String[] args) {
        double[] result = calculate(10,20,4);
        System.out.println("main方法里面收到的：" + result);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static double[] calculate(int a, int b, int c){
        int sum = a + b + c;
        double avg = (sum+0.0) / 3;
        double[] array = new double[2];
        System.out.println("calculate方法里：" + array);
        array[0] = sum;
        array[1] = avg;
        return array;
    }

}
