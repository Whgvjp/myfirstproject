package data1108;

/**
 * 48   0
 * 65   A
 * 97   a
 */
public class Demo03DataTyep {
    public static void main(String[] args) {
        //int num1 = 100L;  //报错
        //下面是强制类型转换
        int num11 = (int)100L;
        System.out.println(num11);

        char zifu1 = '1';
        System.out.println(zifu1 + 0);
        char zifu2 = 'A'; //其实底层保存的是数字 65
        char zifu3 = 'c';
        int num = zifu3;
        System.out.println(num);

        char zifu4 = '中'; //正确写法
        System.out.println(zifu4);  //中
        System.out.println(zifu4 + 0);  //20013 通过加int使结果变成int




    }
}
