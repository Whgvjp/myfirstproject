package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo02ArrayPractise {

    public static void main(String[] args) {
        String str = "asv76agfqwdfvasdfvjh";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        //倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

        System.out.println("=============");

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

    }

}
