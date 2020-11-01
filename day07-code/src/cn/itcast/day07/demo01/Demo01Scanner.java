package cn.itcast.day07.demo01;

import java.util.Scanner;

/*
Scanner类的功能，可以实现键盘输入数据，到程序中

引用类型的一般使用步骤：
1.导包
import 包路径.类名称;
如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
只有java.lang包下的内容不需要导包，其他的包都需要import语句。

2.创建
类名称 对象名 = new 类名称();

3.使用
对象名.成员方法名(参数)


 */
public class Demo01Scanner {

    public static void main(String[] args) {

        //System.in 代表从键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：" );
        String shuru = sc.next();
        System.out.println(shuru);

    }

}
