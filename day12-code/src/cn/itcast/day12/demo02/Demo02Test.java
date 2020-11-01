package cn.itcast.day12.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
计算一个人出生了多少天
Scanner获取出生日期
DateFormat类中的parse，把字符串的出生日期，解析为Date格式
Date转为毫秒
获取当前日期，转为毫秒值
当前-出生 ms  / 1000 /60/24
 */
public class Demo02Test {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期：（格式：yyyy-MM-dd）");
        String birthday = sc.nextLine();
        //将日期转为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);
        long birthdayDateTime = date.getTime();
        //当前日期，毫秒
        long todayTime = new Date().getTime();
        long time = todayTime - birthdayDateTime;
        //转为天输出
        System.out.println("出生了" + time/1000/60/60/24 + "天");

    }

}
