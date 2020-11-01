package cn.itcast.day06.demo03;
/*
面向对象三大特征：封装、继承、多态。
封装性Java当中的体现：
1.方法就是一种封装
2.关键字private也是一种封装
 */

public class Demo02Method {

    public static void main(String[] args) {
        int[] array =  {5, 15, 25, 20, 100};

        System.out.println(getMax(array));
    }

    // 给我一个数组，给你一个最大值
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

}
