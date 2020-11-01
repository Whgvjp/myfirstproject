package cn.itcast.day05.demo03;
/*
数组元素的反转：
[1,2,3,4]
[4,3,2,1]
不能创建新数组
 */
public class Demo07ArrayReverse {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==================");
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i -1] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
