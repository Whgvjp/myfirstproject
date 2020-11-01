package cn.itcast.day04.demo03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }

    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello World!" + (i + 1));
        }
    }

}
