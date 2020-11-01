package cn.itcast.day08.demo02;
/*
String当中与转换相关的常用方法有：

public charp[] toCharArray():将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes(): 获取当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString):
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新的字符串。
 */
public class Demo04StringConvert {

    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars.length);
        System.out.println("====================");

        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        System.out.println(bytes[0]);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        System.out.println("=========================");
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);

        String lang1 = "会不会玩啊！你大爷的！你大爷的！你大爷的！";
        String lang2 = lang1.replace("你大爷的","****");
        System.out.println(lang2);

    }

}
