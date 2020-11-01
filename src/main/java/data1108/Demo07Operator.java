package data1108;

/**
 * 赋值运算符分为：
 * 基本赋值运算符： 就是一个等号 “=”， 代表将右侧的数据交给左侧的变量。
 *      int a = 30;
 * 复合赋值运算符：
 *      +=      a += 1      相当于        a = a + 1
 *      -=      b -= 4      相当于        b = b - 4
 *      *=      c *= 5      相当于        c = c * 5
 *      /=      d /= 6      相当于        d = d / 6
 *      %=      e %= 7      相当于        e = e % 7
 * 注意事项：
 *      1.只有变量才能使用赋值运算符，常量不能进行赋值。
 *      2.复合赋值运算符，其中隐含了一个强制类型转换。
 */
public class Demo07Operator {
    public static void main(String[] args) {
        int a = 10;
        a +=  5;
        System.out.println(a);  // 15
        a -= 3;
        System.out.println(a);  // 12
        a *= 2;
        System.out.println(a);  // 24
        a /= 6;
        System.out.println(a);  // 4
        a %= 3;
        System.out.println(a);  // 1

        byte num = 30;
        num += 5;
        //num = (byte)(num + 5);
        System.out.println(num);   // 35
        System.out.println(getType(num));   //class java.lang.Byte

    }
    public static String getType(Object o){
        return o.getClass().toString();
    }
}
