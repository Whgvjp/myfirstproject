package cn.itcast.day12.demo04;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }
    
    private static void demo01(){
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long s2 = System.currentTimeMillis();
        System.out.println("程序耗时：" + (s2-s1)+ "毫秒");
    }

    /*
    arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
          从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
     */
    private static void demo02(){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,0};
        System.arraycopy(arr1,0,arr2,0,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("===========");
        System.out.println(Arrays.toString(arr2));
    }
}
