package cn.itcast.day08.demo02;

/*
String 当中与获取相关的常用方法有：

public int length(); 获取字符串当中含有字符个数，拿到字符串长度。
public String concat(String str); 将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index); 获取指定索引位置的单个字符（索引从0开始）
public int indexOf(String str); 查找字符串在本字符串当中首次出现的索引位置，没有的话返回-1

 */
public class Demo02StringGet {

    public static void main(String[] args) {
        int length = ";alkjdglg;alkjdg".length();
        System.out.println("长度：" + length);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);   // Hello
        System.out.println(str2);   // World
        System.out.println(str3);   // HelloWorld，新的字符串
        System.out.println("===================");
        char ch = "hello".charAt(1);
        System.out.println("1号：" + ch);
        System.out.println("===================");

        //查找参数字符串在本来字符串当中第一次出现的索引位置，没有返回-1
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println(index);
        System.out.println("HelloWorld".indexOf("abc"));

    }

}
