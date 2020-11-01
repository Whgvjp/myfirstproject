package cn.itcast.day08.demo02;

import java.util.Scanner;

/*
键盘输入一个字符串，统计其中各种字符出现次数。
种类有：大写字母、小写字母、数字、其他。
 */
public class Demo07StringCount {

    public static void main(String[] args) {
        System.out.println("请输入要查询的字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int upper = 0;
        int lower = 0;
        int num = 0;
        int other = 0;
        System.out.println(str.charAt(1));
        for (int i = 0; i < str.length(); i++) {
            if('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                lower += 1;
            }else if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                upper += 1;
            }else if('0' < str.charAt(i) && str.charAt(i) < '9'){
                num += 1;
            }else {
                other += 1;
            }
        }
        System.out.println("大写字母：" + upper + "次;");
        System.out.println("小写字母：" + lower + "次;");
        System.out.println("数字：" + num + "次;");
        System.out.println("其他：" + other + "次。");
    }

}
