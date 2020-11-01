package cn.itcast.day12.demo06;

/*
基本类型和字符串之间转换
基本类型-》字符串类型
    1.基本类型 + "",最简单的方法
    2.包装类的静态方法 toString() 重载
    3.String类的静态方法valueOf(参数)
字符串类型-》基本类型
    使用包装类的静态方法 paseXXX
    Integer 类： static int parseInt(String s)
    Double 类： static double parseDouble(String s)
 */
public class Demo03Integer {
    public static void main(String[] args) {
        int i = 1;
        String a = i + "";
        System.out.println(a);
        Integer it1 = i;
        String str1 = it1.toString();
        String str2 = String.valueOf(i);

        int a1 = Integer.parseInt("10");
        double d = Double.parseDouble("1.223");
        System.out.println(d);


    }
}
