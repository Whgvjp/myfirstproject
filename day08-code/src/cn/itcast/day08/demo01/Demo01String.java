package cn.itcast.day08.demo01;
/*
创建字符串的常见3+1种方式。
三种构造方法：
public String():创建一个空白字符串，不包含任何内容。
public String(char[] array):根据字符数组的内容，来创建对应的字符串。
public String(byte[] array):根据字节数组的内容，来创建对应的字符串。
一种直接创建：
String str = "Hello";

注意：直接写上双引号，就是字符串对象。相当于new
 */
public class Demo01String {

    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();//小括号留空，说明字符串什么内容都没有。
        System.out.println("第一个字符串： " + str1);

        //根据字符数组创建字符串
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串： " + str2);

        //根据字节数组创建字符串
        byte[] byteArra = {97, 98, 99};
        String str3 = new String(byteArra);
        System.out.println("第三个字符串： " + str3);

        String str = "Hello";
        System.out.println(str);
    }

}
