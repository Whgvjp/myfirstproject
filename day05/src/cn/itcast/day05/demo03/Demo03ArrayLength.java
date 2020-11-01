package cn.itcast.day05.demo03;
/*
获取数组长度：
数组名称.length
这将会得到一个int类型的数字，代表数组长度
数组一旦创建，程序运行期间，长度不可变
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = {10,20,30,3,5,6,2,3,4,534,634,46,2345};
        System.out.println(arrayB.length);
        int len = arrayB.length;
        System.out.println(len);
        System.out.println("=================");
        //下面的两个new所以其实是两个数组，不是一个数组
        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
