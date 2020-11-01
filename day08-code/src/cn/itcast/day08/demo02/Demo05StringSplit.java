package cn.itcast.day08.demo02;

/*
分割字符串的方法：
public String[] split(String regex):按照参数的规则，将字符串切分为若干部分。

注意事项：
split 方法的参数其实是一个“正则表达式”，今后学习。
如果按照英文句号“.”进行切分，必须写 \\. 这样就能切成功
 */
public class Demo05StringSplit {

    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] strings = str1.split(",");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("==================");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("==================");

        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }

}
