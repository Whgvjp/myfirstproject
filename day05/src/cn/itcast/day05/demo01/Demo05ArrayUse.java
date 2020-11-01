package cn.itcast.day05.demo01;
/*
使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下，
如果是整数类型，那么默认为0；
如果是浮点类型，那么默认为0.0；
如果是字符类型，那么默认为'\u0000'；
如果是布尔类型，那么默认为false；
如果是引用类型，那么默认为null；
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {

        int[] array = new int[3];

        System.out.println(array);  //内存地址值
        System.out.println(array[0]);   // 0
        System.out.println(array[1]);   // 0
        System.out.println(array[2]);   // 0
        System.out.println("===================");

        //将数据123赋值交给数组array当中的1号元素
        array[1] = 123;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

    }
}
