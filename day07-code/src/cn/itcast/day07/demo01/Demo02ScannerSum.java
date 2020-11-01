package cn.itcast.day07.demo01;

import java.util.Scanner;

/*
题目：键盘输入两个int数字，并且求出和值；
思路：
1.用到Scanner
2.Scanner的三个步骤：导包、创建、使用
3.需要的是两个数字，所以两次 nextInt方法
4.得到两个数字，加起来

 */
public class Demo02ScannerSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int a = sc.nextInt();
        System.out.println("输入2：");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

}
