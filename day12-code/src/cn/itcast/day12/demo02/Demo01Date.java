package cn.itcast.day12.demo02;

/*
java.util.Date ： 表示日期和时间的类
类 Date 表示特定的瞬间，精确到毫秒。
毫秒： 1秒 = 1000ms
毫秒作用，计算日期差值，先转为毫秒减，然后将毫秒转为天
 */
public class Demo01Date {

    public static void main(String[] args) {
        //获取当前系统时间到1970年1月1日零点经历多少毫秒
        System.out.println(System.currentTimeMillis());
    }

}
