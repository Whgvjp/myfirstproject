package data1108;

/**
 * 与（并且）    &&
 * 或（或者）    ||
 * 非（取反）    ！
 */
public class Demo09Logic {
    public static void main(String[] args) {

        System.out.println(true && false);

        System.out.println(true && true);

        System.out.println(3 < 4 && 10 > 5);

        int a = 10;
        //短路效应
        // false && ... 后面不执行
        System.out.println( 3 > 4 && ++a < 100);
        System.out.println(a);

        System.out.println( ++a < 100 && 3 > 4);
        System.out.println(a);


    }
}
