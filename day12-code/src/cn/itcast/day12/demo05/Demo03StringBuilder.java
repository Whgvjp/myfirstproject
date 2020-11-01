package cn.itcast.day12.demo05;

/*
StringBuilder 和 String 可以互相转换；
String->StringBuilder       new StringBuilder(String str)
StringBuilder -> String     StringBuilder.toString方法
 */
public class Demo03StringBuilder {

    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb1 = new StringBuilder(str);
        sb1.append(" world");
        System.out.println(sb1);

        String str2 = sb1.toString();
        System.out.println("s:" + str2);
    }

}
