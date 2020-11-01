package cn.itcast.day12.demo05;

public class Demo02StringBuilder {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1:" + sb1);
        //append方法返回的是this，调用方法的对象sb1，this==sb1
        StringBuilder sb2 = sb1.append("abc");
        System.out.println(sb2);
        System.out.println(sb1 == sb2);

        //使用append方法无需接受返回值
        sb1.append("中").append("kkk").append(1).append(true).append(8.8);
        System.out.println(sb1);

    }

}
