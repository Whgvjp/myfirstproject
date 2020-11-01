package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo04Random {

    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1; //[1,100]
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("请猜：");
            int gussNum = sc.nextInt();
            if(gussNum > randomNum){
                System.out.println("大了，重试：");
            } else if (gussNum < randomNum) {
                System.out.println("小了，重试：");
            }else {
                System.out.println("中了！");
                break;
            }
        }
        System.out.println("游戏结束");

    }

}
