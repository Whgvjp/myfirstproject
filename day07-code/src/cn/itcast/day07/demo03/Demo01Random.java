package cn.itcast.day07.demo03;
import java.util.Random;
/*
Random类用来生成随机数字。使用起来也是三个步骤：

1.导包
2.创建
3.使用
nextInt() 范围是随机的一个int数字（范围是int所有范围，有正负两种)
nextInt(n) 随机获取一个int数字（参数代表了范围，左闭右开区间）即[0,n);
 */
public class Demo01Random {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);
    }

}
