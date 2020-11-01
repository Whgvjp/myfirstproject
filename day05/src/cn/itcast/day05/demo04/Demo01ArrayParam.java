package cn.itcast.day05.demo04;
/*
数组可以作为方法的参数。
当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值
 */
public class Demo01ArrayParam {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        printArray(array);
        System.out.println("==================");
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i -1] = temp;
        }
    }

    public static void printArray(int[] array){
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
