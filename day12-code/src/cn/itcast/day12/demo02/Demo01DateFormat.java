package cn.itcast.day12.demo02;

import java.beans.SimpleBeanInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat: 是日期/时间格式化子类的抽象类
作用：
    格式化（也就是日期 -> 文本）、解析（文本 -> 日期）
成员方法：
    String format(Date date) 按照指定的模式，把Date日期，格式化为符合模式的字符串
    Date parse(String source) 把符合模式的字符串，解析为Date日期
DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类

java.text.SimpleDateFormat extends DateFormat

构造方法：
    SimpleDateFormat(String pattern)
        用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
    参数：
        String pattern： 传递指定的模式
    模式：区分大小写的
    y   年
    M   月
    d   日
    H   时
    m   分
    s   秒
    写对应的模式，会把模式替换为对应的日期和时间
        "yyyy-MM-dd HH:mm:ss"
        "yyyy年MM月dd日 HH时mm分ss秒"
    注意：
        模式中的字母不能更改
 */
public class Demo01DateFormat {

    public static void main(String[] args) throws ParseException {

        //demo01();
        demo02();

    }
    //日期转化为文本
    //1.创建SimpleDateFormat对象，构造方法中传递指定模式
    //2.调用SimpleDateFormat对象中的format方法，把日期转换为文本
    private static void demo01(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }
    // 调用SimpleDateFormat对象中的parse方法，将文本转换为日期格式
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2088年08月08日 15时51分54秒");
        System.out.println(date);
    }

}
