package data1108;

/**
 * 自增运算符： ++
 * 自减运算符： --
 *
 * 基本含义： 让一个变量涨一个数字1，或者让一个数字减一个数字1
 * 使用格式： 写在变量名称之前，或者之后。例如： ++num，也可以 num++
 * 使用方式：
 *      1.单独使用： 不和其他操作混合，自己独立成为一个步骤。
 *      2.混合使用： 和其他操作混合，例如与赋值混合，或打印语句混合
 * 使用区别：
 *      1.在单独使用时候，没有区别
 *      2.混合使用有【重大区别】
 *          A.如果是【前++】，那么变量【马上+1】，然后拿着结果进行使用。       【先加后用】
 *          B.如果是【后++】，那么首先使用变量本来的值，【然后再让变量+1】。   【先用后加】
 *
 * 注意事项：
 *
 */
public class Demo06Operator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);   //10
        ++num1; //前++
        System.out.println(num1);   //11
        num1++; //后++
        System.out.println(num1);   //12
        System.out.println("===============================================");

        int num2 = 20;
        System.out.println(++num2); // 21
        System.out.println(num2);
        System.out.println("===============================================");

        int num3 = 30;
        System.out.println(num3++); // 30
        System.out.println(num3);   // 31

        System.out.println("===============================================");

        int num4 = 40;
        int result1 = --num4;
        System.out.println(result1);
        System.out.println(num4);
        int result2 = num4--;
        System.out.println(result2);
        System.out.println(num4);

        System.out.println("===============================================");

        int x = 10;
        int y = 20;
        int result3 = ++x + y--;
        System.out.println(result3);    // 31
        //30++；     常量不能使用自增、自减运算符，只有变量能用。

    }
}
