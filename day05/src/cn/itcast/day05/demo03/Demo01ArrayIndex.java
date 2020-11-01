package cn.itcast.day05.demo03;
/*
数组的索引编号从0开始，一直到“数组的长度-1”为止。
 */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {15,25,35};
        System.out.println(array[0]);
        System.out.println(array[2]);
        //错误写法，因为不存在下标为3的
        //下面的就是数组下标越界异常
        System.out.println(array[3]);
    }
}
