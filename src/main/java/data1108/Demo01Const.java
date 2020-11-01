package data1108;

public class Demo01Const {
    public static void main(String[] args) {
        //字符串常量
        System.out.println("ABC");
        System.out.println("");
        System.out.println("xyz");
        //整数常量
        System.out.println(30);
        System.out.println(-250);
        //浮点数常量
        System.out.println(3.14);
        System.out.println(-9.0);
        //字符常量
        System.out.println('A');
        System.out.println('6');
        System.out.println('中');
        //两个单引号中间必须有且只有一个字符，没有不行，所以下面这两行会编译报错。
        //System.out.println('');
        //System.out.println('ab');
        //布尔常量
        System.out.println(true);
        System.out.println(false);
        //空常量，不能直接打印,所以下面的会编译报错
        //System.out.println(null);
    }
}
