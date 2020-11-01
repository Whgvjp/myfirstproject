package cn.itcast.day12.demo03;

import java.util.Calendar;
import java.util.Date;

/*
    public final static int YEAR = 1;       年
    public final static int MONTH = 2;      月
    public final static int DATE = 5;       月中的某一天
    public final static int DAY_OF_MONTH = 5;   月中的某一天
    public final static int HOUR = 10;          时
    public final static int MINUTE = 12;        分
    public final static int SECOND = 13;        秒

 */
public class Demo02Calendar {

    public static void main(String[] args) {
        //demo01();
        //demo02();
        //demo03();
        demo04();

    }

    private static void demo01(){
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        System.out.println(c.get(Calendar.MONTH));

        int date = c.get(5);
        System.out.println(date);
    }

    private static void demo02(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,9999);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        System.out.println(c.get(Calendar.MONTH));

        int date = c.get(5);
        System.out.println(date);
    }

    private static void demo03(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,2);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    private static void demo04(){
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }
}
