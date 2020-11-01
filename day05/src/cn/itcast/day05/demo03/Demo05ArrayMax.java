package cn.itcast.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,25,50,30,100,76};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
