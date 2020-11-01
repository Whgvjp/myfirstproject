package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个：");
        int a = sc.nextInt();
        System.out.println("输入第二个：");
        int b = sc.nextInt();
        System.out.println("输入第三个：");
        int c = sc.nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println(max);
    }

}
