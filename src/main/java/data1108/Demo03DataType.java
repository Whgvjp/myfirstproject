package data1108;

/**
 * 当数据类型不一样时，将会发生数据类型转换
 * 自动类型转换（隐式）.
 *      1.代码不需要特殊处理，自动完成
 *      2.规则：数据范围从小到大
 * 强制类型转换（显式）.
 *      1.特点：代码需要进行特殊的处理，不能自动完成。
 *      2.格式： 范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;
 *注意事项：
 *      1.强制类型转换一般不推荐使用，因为有时候可能发生精度损失，数据溢出。
 *      2.byte/short/char 这三种类型都可以发生数学运算，例如加法 ‘+’
 *      3.byte/short/char 这三种类型在运算时候，都会首先被提升为int类型，然后再计算。
 *      4.boolean类型不能发生数据类型转换。
 */
public class Demo03DataType {
    public static void main(String[] args) {
        System.out.println(1024);       // 这就是一个整数，默认就是 int 类型
        System.out.println(3.14);       // 这就是一个浮点数，默认double类型
        //左边是long类型，右边是默认的int类型，左右不一样，
        //int --> long 符合从小到大，发生了自动类型转换
        long num1 = 10000;
        System.out.println(num1);
        double num2 = 2.5F;
        System.out.println(num2);
        //flout虽然是4个字节，但是表达的数据范围是大于long类型的（8字节）
        float num3 = 30L;       //30.0
        System.out.println(num3);

        //范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;
        int num11 = (int)100L;
        System.out.println(num11);
        int num6 = (int)6000000000L;        //结果是1705032704 !!!!! 发生了数据溢出。
        System.out.println(num6);
        //double --> int，强制类型转换
        int num7 = (int) 3.5;
        System.out.println(num7);       //结果是3，并不是四舍五入，所有小数位都会被舍弃掉

        char zifu1 = 'A';   //这是一个字符变量，大写A
        System.out.println(zifu1 + 1);      //结果是 66

        byte num4 = 40;
        byte num5 = 50;
        //byte resul1 = num4 + num5;
        int result1 = num4 + num5;       //因为 byte/short/char运算都会先自动转为int
        //byte result2 = (byte)num4 + (byte)num5; 这样也不行
        byte result2 = (byte)(num4 + num5);
    }
}
